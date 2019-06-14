//
// Source code recreated from a .class com.randy.file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.randy.jse;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.util.Locale;

public class Note_Component {
    public Note_Component() {
    }

    public static void main(String[] args) {
        MyComponent myComponent = new MyComponent();
        field(myComponent);
        setMyComponent(myComponent);
        seeMyComponent(myComponent);
    }

    public static void seeMyComponent(MyComponent myComponent) {
        System.out.println("是否包含点(1,1)：" + myComponent.contains(1, 1));
        System.out.println("原点当前X坐标：" + myComponent.getX());
        System.out.println("原点当前Y坐标：" + myComponent.getY());
        System.out.println("X轴对齐方式：" + myComponent.getAlignmentX());
        System.out.println("Y轴对齐方式：" + myComponent.getAlignmentY());
        System.out.println("获取基线：" + myComponent.getBaseline(100, 50));
        System.out.println("获取边界：" + myComponent.getBounds());
        System.out.println("获取高度：" + myComponent.getHeight());
        System.out.println("获取宽度：" + myComponent.getWidth());
        System.out.println("当前背景色为：" + myComponent.getBackground());
        System.out.println("当前字体：" + myComponent.getFont());
    }

    public static void setMyComponent(MyComponent myComponent) {
        System.out.println("是否可显示：" + myComponent.isDisplayable());
        myComponent.addNotify();
        System.out.println("更改后是否可显示：" + myComponent.isDisplayable());
        myComponent.setName("MyComponent");
        myComponent.setPreferredSize(new Dimension(200, 100));
        myComponent.setBounds(100, 100, 100, 100);
        myComponent.setSize(100, 200);
        myComponent.setLocation(200, 200);
        myComponent.setMaximumSize(new Dimension(500, 500));
        myComponent.setMinimumSize(new Dimension(50, 50));
        myComponent.doLayout();
        myComponent.setForeground(Color.YELLOW);
        myComponent.setBackground(Color.RED);
        myComponent.setCursor(Cursor.getPredefinedCursor(1));
        myComponent.setLocale(Locale.CHINA);
        myComponent.setEnabled(true);
        myComponent.setVisible(true);
    }

    public static void field(MyComponent myComponent) {
        System.out.println("中心基准" + 0.5F);
        System.out.println("顶基准" + 0.0F);
        System.out.println("底基准" + 1.0F);
        System.out.println("左基准" + 0.0F);
        System.out.println("右基准" + 1.0F);
    }
}
