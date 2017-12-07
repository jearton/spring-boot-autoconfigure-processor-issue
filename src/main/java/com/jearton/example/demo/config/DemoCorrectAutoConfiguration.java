package com.jearton.example.demo.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;

/**
 * @author jearton
 * @since 2017/12/7 下午5:01
 */
@ConditionalOnClass(name = "com.jearton.example.demo.NodeFactory$TestNode")
public class DemoCorrectAutoConfiguration {
}
