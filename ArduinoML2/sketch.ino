void setup() {
	pinMode(8, INPUT);
	pinMode(11, OUTPUT);
	pinMode(12, OUTPUT);
}
void quiet() {
	digitalWrite(12, LOW);
	digitalWrite(11, LOW);
	if(digitalRead(8) == HIGH && 1 == 1) { return noise(); }
	else { return quiet(); }
}
void noise() {
	digitalWrite(12, HIGH);
	digitalWrite(11, HIGH);
	if(digitalRead(8) == LOW && 1 == 1) { return quiet(); }
	else { return noise(); }
}
void loop() { return quiet(); }