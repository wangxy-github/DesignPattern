package single.mei.type2_Factory.factoryMethod;

import single.mei.type2_Factory.simpleFactory.IRuleConfigParser;
import single.mei.type2_Factory.simpleFactory.YamlRuleConfigParser;

/**
 * @author wxy
 * @date: 2023/5/16 12:31 AM
 * @ClassName: YamlRuleConfigParserFactory
 */
public class YamlRuleConfigParserFactory implements IRuleConfigParserFactory{
    @Override
    public IRuleConfigParser createParser() {
        return new YamlRuleConfigParser();
    }
}
