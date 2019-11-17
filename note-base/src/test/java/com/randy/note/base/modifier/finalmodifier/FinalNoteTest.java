package com.randy.note.base.modifier.finalmodifier;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Author: randy
 * Date: 2019/11/17 14:36
 */
class FinalNoteTest {

    @Test
    void testFinalInt() {
        FinalNote finalNote = new FinalNote();
        // 报错
        // finalNote.i = 2;
    }

    @Test
   void testFinalStringBuilder(){
        FinalNote finalNote = new FinalNote();

        // 报错
        // finalNote.sb = new StringBuilder("bs");

        // 可以修改内部值
        finalNote.sb.append("bbb");
        System.out.println(finalNote.sb);
    }
}