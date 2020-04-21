package com.jhr.dog;

import java.io.Serializable;

/**
 * <br>
 * 标题：
 * 描述：
 *
 * @author jhr
 * @create 2020/04/17 14:41
 */
public class BookBO implements Serializable {

    private static final long serialVersionUID = -5668455553985708753L;

    private String bookname;
    private Integer bookNum;

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public Integer getBookNum() {
        return bookNum;
    }

    public void setBookNum(Integer bookNum) {
        this.bookNum = bookNum;
    }

    @Override
    public String toString() {
        return "BookBO{" +
                "bookname='" + bookname + '\'' +
                ", bookNum=" + bookNum +
                '}';
    }
}
