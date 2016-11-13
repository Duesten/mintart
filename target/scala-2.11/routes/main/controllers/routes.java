
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Mo Lester/Desktop/mintart/conf/routes
// @DATE:Sun Oct 16 17:48:46 CEST 2016

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseMintPreview MintPreview = new controllers.ReverseMintPreview(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseMintPreview MintPreview = new controllers.javascript.ReverseMintPreview(RoutesPrefix.byNamePrefix());
  }

}
