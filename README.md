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


Git status -> Mirar si tienes modificaciones tuyas y si existe algún pull o push
Git fetch -> Por si acaso tus ramas no se han actualizado correctamente, esto NO actualiza los ficheros de las ramas, sólo el estado de esa rama
Git status -> Para verificar de nuevo modificaciones, pull y pushs
Git pull -> Ahora sí descargas las actualizaciones
Git add/commit/... -> Ahora guardas tus modificaciones
Git status -> Miras que siga sin necesitar un pull, por si las moscas
Git push -> Subes tus datos
Git status -> Compruebas que está todo correctamente
