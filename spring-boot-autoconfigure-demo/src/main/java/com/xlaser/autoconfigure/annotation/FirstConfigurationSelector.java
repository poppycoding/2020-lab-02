package com.xlaser.autoconfigure.annotation;

import com.exclude.config.SelectorFirstConfiguration;
import com.exclude.config.SelectorSecondConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.lang.NonNull;

/**
 * @package: com.xlaser.autoconfigure.annotation
 * @author: Elijah.D
 * @time: 2019/10/26 17:39
 * @description:
 * @copyright: Copyright© 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
@Slf4j
public class FirstConfigurationSelector extends BaseActiveModeImportSelector<EnableFirstSelector> {
    /**
     * 根据active获取不同配置
     *
     * @param activeMode type
     * @return config
     */
    @Override
    @NonNull
    public String[] selectImports(ActiveMode activeMode) {
        switch (activeMode) {
            case FIRST:
                return new String[]{SelectorFirstConfiguration.class.getName()};
            case SECOND:
                return new String[]{SelectorSecondConfiguration.class.getName()};
            default:
                return null;
        }
    }
}
