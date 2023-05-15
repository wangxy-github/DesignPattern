package single.mei.type2_Factory.factoryMethod;

import single.mei.type2_Factory.simpleFactory.IRuleConfigParser;

/**
 * @author wxy
 * @date: 2023/5/16 12:30 AM
 * @ClassName: IRuleConfigParserFactory
 */
public interface IRuleConfigParserFactory {
    IRuleConfigParser createParser();
}
