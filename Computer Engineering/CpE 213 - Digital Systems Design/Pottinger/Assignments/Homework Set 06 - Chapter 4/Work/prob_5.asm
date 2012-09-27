STATE BIT 0

CSEG AT 0

LJMP START

CSEG AT 100
START:
HUNDRED	EQU 100		;100 X 10000 us = 1 sec
COUNT	EQU -10000
;	ORG 8100H
	MOV TMOD,#01H	;use timer 0 in mode 1
;LOOP:	JNB P1.6, LOOP	;wait for 1 input
;WAIT:	JB P1.6, WAIT	;wait for 0 input
;	SETB P1.7	;turn buzzer on
;	CALL DELAY	;wait 1 second
;	CLR P1.7	;turn buzzer off
;	SJMP LOOP
	;
DELAY:	CLR STATE
	MOV R7, #HUNDRED
AGAIN:	MOV TH0, #HIGH COUNT
	MOV TL0, #LOW COUNT
	SETB TR0
WAIT2:	JNB P1.6,LOOP2
	MOV C, P1.6
	MOV STATE,C
LOOP2:	JB P1.6,LOOP3
	JBC STATE, DELAY
LOOP3:	JNB TF0, WAIT2
	CLR TF0
	CLR TR0
	DJNZ R7, AGAIN
;	RET
	END