package single.mei.type3_builder;

import cn.hutool.core.util.StrUtil;

/**
 * @author wxy
 * @date: 2023/5/16 12:59 AM
 * @ClassName: ResourcePoolConfig
 */

public class ResourcePoolConfig {
    private String name;
    private int maxTotal;
    private int maxIdle;
    private int minIdle;

    private ResourcePoolConfig(ResourceBuilder builder) {
        this.name = builder.name;
        this.maxTotal = builder.maxTotal;
        this.maxIdle = builder.maxIdle;
        this.minIdle = builder.minIdle;
    }

    public static class ResourceBuilder {
        private static final int DEFAULT_MAX_TOTAL = 8;
        private static final int DEFAULT_MAX_IDLE = 8;
        private static final int DEFAULT_MIN_IDLE = 0;

        private String name;
        private int maxTotal = DEFAULT_MAX_TOTAL;
        private int maxIdle = DEFAULT_MAX_IDLE;
        private int minIdle = DEFAULT_MIN_IDLE;


        public ResourcePoolConfig build() {
            if (StrUtil.isBlank(name) || maxIdle > maxTotal || minIdle > maxIdle) {
                throw new IllegalArgumentException("...");
            }
            return new ResourcePoolConfig(this);
        }

        public ResourceBuilder setName(String name) {
            if (StrUtil.isBlank(name)) {
                throw new IllegalArgumentException("...");
            }
            this.name = name;
            return this;
        }


        public ResourceBuilder setMaxTotal(int maxTotal) {
            if (maxTotal <= 0) {
                throw new IllegalArgumentException("...");
            }
            this.maxTotal = maxTotal;
            return this;
        }

        public ResourceBuilder setMaxIdle(int maxIdle) {
            if (maxIdle < 0) {
                throw new IllegalArgumentException("...");
            }
            this.maxIdle = maxIdle;
            return this;
        }
        public ResourceBuilder setMinIdle(int minIdle) {
            if (minIdle < 0) {
                throw new IllegalArgumentException("...");
            }
            this.minIdle = minIdle;
            return this;
        }


    }
}
