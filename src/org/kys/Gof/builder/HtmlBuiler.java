package org.kys.Gof.builder;

public class HtmlBuiler extends Builer{

    StringBuffer stringBuffer = new StringBuffer();

    @Override
    public void makeTitile(String title) {
        stringBuffer.append("<p>"+title+"</p>\n");
    }

    @Override
    public void makeItem(String item) {
        stringBuffer.append("<p>"+item+"</p>\n");
    }

    @Override
    public void makeEndoFText(String end) {
        stringBuffer.append("<p>"+end+"</p>\n");
    }

    @Override
    public String getResult() {
        return stringBuffer.toString();
    }
}
