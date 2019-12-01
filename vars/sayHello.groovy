#!/usr/bin/env groovy

def call(String name = 'human') {
  echo "Hello, ${name}."
println new URL( "https://query.yahooapis.com/v1/public/yql?q=" +
        URLEncoder.encode(
                "select wind from weather.forecast where woeid in " +
                        "(select woeid from geo.places(1) where text='chicago, il')",
                'UTF-8' ) ).text
}
