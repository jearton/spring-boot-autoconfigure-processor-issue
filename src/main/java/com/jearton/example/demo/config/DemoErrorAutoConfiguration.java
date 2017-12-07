package com.jearton.example.demo.config;

import com.jearton.example.demo.NodeFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;

/**
 * @author jearton
 * @since 2017/12/7 下午5:03
 */
@ConditionalOnClass(NodeFactory.TestNode.class)
public class DemoErrorAutoConfiguration {
}
