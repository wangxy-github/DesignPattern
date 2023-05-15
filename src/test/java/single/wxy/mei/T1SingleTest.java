package single.wxy.mei;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.AssertionsKt;
import org.junit.jupiter.api.Test;
import single.mei.type1_Single.*;

/**
 * @author wxy
 * @date: 2023/5/15 11:02 PM
 * @ClassName: T1SingleTest
 */
public class T1SingleTest {

    @Test
    void test1() {
        EHanShiOne instance1 = EHanShiOne.getInstance();
        EHanShiOne instance2 = EHanShiOne.getInstance();
        Assertions.assertEquals(instance1, instance2);
    }


    @Test
    void test2() {
        LanHanShiOne instance1 = LanHanShiOne.getInstance();
        LanHanShiOne instance2 = LanHanShiOne.getInstance();
        Assertions.assertEquals(instance1, instance2);
    }

    @Test
    void test3() {
        LanHanShiOne instance1 = LanHanShiOne.getInstance();
        LanHanShiOne instance2 = LanHanShiOne.getInstance();
        Assertions.assertEquals(instance1, instance2);
    }

    @Test
    void test4() {
        NeiBuLei instance1 = NeiBuLei.getInstance();
        NeiBuLei instance2 = NeiBuLei.getInstance();
        Assertions.assertEquals(instance1, instance2);
    }

    @Test
    void test5() {
        MeiJu instance1 = MeiJu.INSTANCE;
        MeiJu instance2 = MeiJu.INSTANCE;
        Assertions.assertEquals(instance1, instance2);
    }

    @Test
    void test6() {
        DuoLi instance1 = DuoLi.getInstance(1);
        DuoLi randomInstance = DuoLi.getRandomInstance();
        System.out.println(instance1);
        System.out.println(randomInstance);
    }
}
