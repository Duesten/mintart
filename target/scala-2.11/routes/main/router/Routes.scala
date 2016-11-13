
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Mo Lester/Desktop/mintart/conf/routes
// @DATE:Sun Oct 16 17:48:46 CEST 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:8
  MintPreview_1: controllers.MintPreview,
  // @LINE:39
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:8
    MintPreview_1: controllers.MintPreview,
    // @LINE:39
    Assets_0: controllers.Assets
  ) = this(errorHandler, MintPreview_1, Assets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, MintPreview_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.MintPreview.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:8
  private[this] lazy val controllers_MintPreview_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_MintPreview_index0_invoker = createInvoker(
    MintPreview_1.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MintPreview",
      "index",
      Nil,
      "GET",
      """ An example controller showing how to write asynchronous code
GET     /message                    controllers.AsyncController.message
""",
      this.prefix + """"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """
GET     /users                      controllers.Users.list

POST    /users/create               controllers.Users.create
GET     /users/:id                  controllers.Users.show(id : Long)
POST    /users/:id/edit             controllers.Users.edit(id : Long)
POST    /users/:id/delete           controllers.Users.delete(id : Long)




GET     /items/import               controllers.Application.importCSV
GET     /items                      controllers.Items.list

POST    /items/create               controllers.Items.create
GET     /browse/:category            controllers.Items.showCategory(category : String)
GET     /browse                      controllers.Items.showCategories
POST    /items/find                  controllers.Items.textSearch
GET     /items/show/:id              controllers.Items.show(id : Long)
GET     /about                       controllers.Application.about
GET     /mint                        controllers.MintPreview.index
POST    /items/:id/edit             controllers.Items.edit(id: Long)
POST    /items/:id/delete           controllers.Items.delete(id : Long)
POST    /items/:id/reserve          controllers.Items.reserve(id : Long)

GET     /init                       controllers.Users.init()



 Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:8
    case controllers_MintPreview_index0_route(params) =>
      call { 
        controllers_MintPreview_index0_invoker.call(MintPreview_1.index)
      }
  
    // @LINE:39
    case controllers_Assets_versioned1_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_0.versioned(path, file))
      }
  }
}
