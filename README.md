# DSL-for-Crew

ANTLR v4 installation guide: https://www.antlr.org
- File t1.txt contains example of a mission

- To run the DSL:
  -compile all the files using javac *.java \n
  -to launch a game: java Eval t1.txt \n
  -to test the trick validator without playing the game: java TestTrickValidator t1.txt \n
  -Parse tree visualizer: grun Grammar prog t1.txt -gui &
