package single.mei.type2_Factory.simpleFactory;

/**
 * @author wxy
 * @date: 2023/5/16 12:27 AM
 * @ClassName: IRuleConfigParser
 */
public class IRuleConfigParser {
    public RuleConfig parse(String configText) {
        return new RuleConfig();
    }
}
