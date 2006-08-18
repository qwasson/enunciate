package net.sf.enunciate.modules.xfire.config;

import org.apache.commons.digester.Digester;
import org.apache.commons.digester.RuleSetBase;

/**
 * Rules for the configuration of the XFire module.
 *
 * @author Ryan Heaton
 */
public class XFireRuleSet extends RuleSetBase {

  public void addRuleInstances(Digester digester) {
    //allow client package conversions to be configured.
    digester.addObjectCreate("enunciate/modules/xfire/client-package-conversions/convert", ClientPackageConversion.class);
    digester.addSetProperties("enunciate/modules/xfire/client-package-conversions/convert");
    digester.addSetNext("enunciate/modules/xfire/client-package-conversions/convert", "addClientPackageConversion");
  }

  @Override
  public String getNamespaceURI() {
    return "http://enunciate.sf.net";
  }
}