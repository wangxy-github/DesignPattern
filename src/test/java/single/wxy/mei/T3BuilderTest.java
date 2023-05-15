package single.wxy.mei;

import org.junit.jupiter.api.Test;
import single.mei.type3_builder.ResourcePoolConfig;

/**
 * @author wxy
 * @date: 2023/5/16 1:08 AM
 * @ClassName: T3BuilderTest
 */
public class T3BuilderTest {
    @Test
    void test() {
        ResourcePoolConfig config = new ResourcePoolConfig.ResourceBuilder()
                .setName("xxx")
                .setMaxTotal(16)
                .setMaxIdle(12)
                .setMinIdle(10)
                .build();
        System.out.println(config);
    }
}
