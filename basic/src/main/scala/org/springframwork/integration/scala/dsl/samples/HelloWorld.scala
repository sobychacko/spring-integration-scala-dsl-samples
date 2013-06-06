import org.springframework.integration.dsl.{transform, handle}

/**
 * @author Soby Chacko
 */
object HelloWorld extends App {
  val messageFlow = transform { payload: String => "HelloWorldDemo: Hello " + payload } -->
      handle { payload: String => println(payload)}
    messageFlow.send("World")
}

