package br.com.viaVarejo.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TelaGenerica extends BasePage{
	
	public TelaGenerica(WebDriver driver) {
		super(driver);
	}

	public void aguardarTelaCarregada(){
        boolean elementosumiu=false;
        try {
            for(int i = 0; i < 2; i++) {
                Thread.sleep(500);
                elementosumiu=this.esperaElementoSumir("//*[@*[starts-with(., 'splash')]]", 30);
            }
        } catch (InterruptedException e) {
        }
    }

  public void aguardarTelaCarregada(int timeOutSegundo){
        boolean elementosumiu=false;
        try {
            for(int i = 0; i < 2; i++) {
                Thread.sleep(500);
                
                elementosumiu=this.esperaElementoSumir("//*[@*[starts-with(., 'splash')]]", timeOutSegundo);
            }
        } catch (Exception e) {
           
        }
    }
    
    
    public boolean esperaElementoSumir(String xPath, int segundos_timeout) throws InterruptedException
    {
        Boolean notPresent = !esperarElemento(xPath,0);
        if (notPresent==true){
            return notPresent;
        }
        for (int i = segundos_timeout; i > 0; i--) {
            Thread.sleep(1000);
            notPresent = !esperarElemento(xPath,0);
            if (notPresent==true){
                return notPresent;
            }
        }
        
        return notPresent;
    }
    
   
    /**esperarElemento
     * @param xPath
     * @param segundos_timeout
     * @return
     * @throws InterruptedException
     */
    public boolean esperarElemento(String xPath, int segundos_timeout) throws InterruptedException{
        
        Boolean isPresent = obterElementoVisivel(xPath)!=null;
        if (isPresent==true){
    
            return true;

        }
        
        for (int i = segundos_timeout; i > 0; i--) {
            Thread.sleep(1000);
            isPresent =obterElementoVisivel(xPath)!=null;
            if (isPresent==true){
                WebElement Elem = obterElementoVisivel(xPath);
                if (isClicavel(Elem,segundos_timeout)){
                    isPresent=true;
                }else{
                    isPresent=false;
                }
                return isPresent;
            }
        }
        
        return isPresent;
    }

    /**obterElementoVisivel
     * @param xPath
     * @return
     */
    public WebElement obterElementoVisivel(String xPath){
        try{
            if (driver.findElements(By.xpath(xPath)).size() > 0){
                List<WebElement> elementosEncontrados = driver.findElements(By.xpath(xPath));
                for ( WebElement elem: elementosEncontrados) { 
                    if(elem.isDisplayed()){
                        return elem;
                    }
                }
            }
        }catch (Exception e){
            return null;
        }
        return null;
    }
    
   
    
    /**isClicavel
     * @param webe
     * @param tIME_OUT
     * @return
     */
    public boolean isClicavel(WebElement webe, int tIME_OUT){
        try
        {
           WebDriverWait wait = new WebDriverWait(driver, tIME_OUT);
           wait.until(ExpectedConditions.elementToBeClickable(webe));
           return webe.isDisplayed();
        }
        catch (Exception e)
        {
          return false;
        }
    }
    
    public void clicarJS(WebElement webe){
        try{
        	aguardarTelaCarregada(1);
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("arguments[0].click();", webe);
	   
        } catch (Exception e) {
        }
    }
    
    /**clicarEspecial
     * @param webe
     */
    public void clicarEspecial(WebElement webe){
        try{
        	aguardarTelaCarregada(1);
        	Actions action = new Actions(driver);
        	action.moveToElement(webe).click().perform();
	   
        } catch (Exception e) {
        }
    }
    
    /**digitarEspecial
     * @param webe
     * @param texto
     */
    public void digitarEspecial(WebElement webe, String texto){
        try{
        	aguardarTelaCarregada(1);
        	 Actions builder = new Actions(driver);
        	 Actions seriesOfActions = builder.moveToElement(webe).click().sendKeys(webe, texto);
        	 seriesOfActions.perform();
        } catch (Exception e) {
        }
    }
  
    public void scrollView(WebElement webe){
        try{
        	JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", webe);
            aguardarTelaCarregada(1);
        } catch (Exception e) {
        }
    }
   
    
    
}
