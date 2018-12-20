package com.design.patterns_3_原型模式.ShallowCopy_浅拷贝;

public class Email {
    private Object name;
    private String content;

    public Email(Object name, String content) {
        this.name = name;
        this.content = content;
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public Object getName() {
        return name;
    }
    public void setName(Object name) {
        this.name = name;
    }
}
