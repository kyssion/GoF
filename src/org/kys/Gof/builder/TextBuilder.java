package org.kys.Gof.builder;

//范型在定义的时候使用
public class TextBuilder extends Builer{

    StringBuffer stringBuffer = new StringBuffer();

    @Override
    public void makeTitile(String title) {
        stringBuffer.append(title+"\n");
    }

    @Override
    public void makeItem(String item) {
        stringBuffer.append(item+"\n");
    }

    @Override
    public void makeEndoFText(String end) {
        stringBuffer.append(end+"\n");
    }

    @Override
    public String getResult(){
        return stringBuffer.toString();
    }
}
