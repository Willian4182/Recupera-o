t3: t3-build
	@java -cp bin CorrecaoT3
	
t3-build:
	@javac -d bin CorrecaoT3.java trabalhos/T3.java

clear:
	rm -rf bin

git:
	git config --global user.email "edu.cascacity@gmail.com"
	git config --global user.name "Willian4182"
	echo "iiuoiio"




