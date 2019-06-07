# Hello Scala Play
Testing out the Scala Play framework w/ their Hello World tutorial.

If you want to do something similar, you can find their documentation [here](https://www.playframework.com/getting-started).

The starter app template I used is also found on [Github](https://github.com/playframework/play-samples/tree/2.7.x/play-scala-hello-world-tutorial).

More examples beyond the initial documentation can be found here: 
https://developer.lightbend.com/start/?group=play

## Initial Thoughts
Reminds me a bit of a php mvc. You can write a function that contains your html in a separate file or wherever, 
then you call that function in your template view, as long as you have the fxn for it in the home controller. 
Once you have a new page ready, just add it to the `conf/routes` file, recompile with `sbt run` and you're good to go!

## Future Work
Would be great to figure out how to integrate the Play framework with a UI JS framework like Vue or React. As well as including build tools such as npm or webpack.
There's also something called Scala.js that might be useful too.

Some links for further research:

-Scala.js

https://www.scala-js.org/libraries/facades.html

http://www.lihaoyi.com/hands-on-scala-js/

-Vue

https://github.com/GIVESocialMovement/sbt-vuefy

https://github.com/fancellu/scalajs-vue


-React

https://github.com/japgolly/scalajs-react

Some nice examples here w/ React: https://japgolly.github.io/scalajs-react/#examples/hello



