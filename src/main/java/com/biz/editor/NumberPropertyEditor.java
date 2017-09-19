package com.biz.editor;

import java.beans.PropertyEditorSupport;
import org.apache.commons.lang3.math.NumberUtils;

/**
 * NumberPropertyEditor
 *
 * @author zhangtao
 * @date 2017年08月23日
 * @reviewer
 * @see
 */
public class NumberPropertyEditor extends PropertyEditorSupport {
    public void setAsText(String text) {
        if (text != null && NumberUtils.isParsable(text)) {
            Integer number = Integer.parseInt(text);
            setValue(number);
        }
    }
    public String getAsText() {
        Integer add = (Integer) getValue();
        return "" + add;
    }
}
