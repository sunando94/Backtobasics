package com.databricks.base;

public class CustomDatabricksDriver {
    String data;
    public CustomDatabricksDriver()
    {
        System.out.println("Custom Driver");
    }

    public void runDriver(){
        System.out.println("Running custom Driver");
    }

    /***
     *
     * @return String data
     */
    private String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
