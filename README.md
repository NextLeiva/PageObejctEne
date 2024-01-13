Se pueden usar estas recomendaciones para encontrar objetos

  

    public void selectOptions(String option){
        List<WebElement> elements = category.findElements(By.tagName("h5"));
        for(WebElement element:elements){
            if(element.getText().equals(option)){
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].click();",element);
                break;
            }
        }


