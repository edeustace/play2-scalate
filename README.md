# play2-scalate

### About

A simple [play 2.0](http://www.playframework.org) plugin for using scalate templates as view rendering in play 2.0.

For more information, see [Scalate](http://scalate.fusesource.org/)


Scalate markups :

* [mustache](http://mustache.github.com/)
* [scaml](http://scalate.fusesource.org/documentation/scaml-reference.html)
* [jade](http://jade-lang.com/)


Work in progress…

### Samples

Controller using mustache rendering :

```
def index = Action {implicit request=>
    Ok(Template.render("index.mustache",Map(
      "name"->"Chris",
      "value" -> 10000,
      "taxed_value" -> (10000 - (10000 * 0.4)),
      "in_ca" -> true
    )))
  }
```

And the template :

```
<!DOCTYPE html>

<html>
    <head>
        <title>Hello, {{name}}</title>
    </head>
    <body>
        <p>Hello {{name}}</p>
        <p>You have just won <b>${{value}}</b>!</p>
        {{#in_ca}}
        <p>Well, <b>${{taxed_value}}</b>, after taxes.</p>
        {{/in_ca}}
    </body>
</html>
```

