.intel_syntax noprefix
.bits 32
	
.global asm0

asm0:
	push	ebp
	mov	ebp,esp
	mov	eax,DWORD PTR [ebp+0x8]
	mov	ebx,DWORD PTR [ebp+0xc]
	mov	eax,ebx
	mov	esp,ebp
	pop	ebp	
	ret

# I only used stuff relevant to the code above

# Data Regisets | Keywords
As complete 32-bit data registers: EAX, EBX, ECX, EDX

Lower halves of the 32-bit registers can be used as four 16-bit data registers: AX, BX, CX and DX.

Lower and higher halves of the above-mentioned four 16-bit registers can be used as
 eight 8-bit data registers: AH, AL, BH, BL, CH, CL, DH, and DL.

# Data Registers 
AX is the primary accumulator; it is used in input/output and most arithmetic instructions. 
For example, in multiplication operation, one operand is stored in EAX or AX or AL 
register according to the size of the operand.

# Pointer Registers
The pointer registers are 32-bit EIP, ESP, and EBP registers and corresponding 16-bit 
right portions IP, SP, and BP. There are three categories of pointer registers −

Instruction Pointer (IP) − The 16-bit IP register stores the offset address of the next 
instruction to be executed.

Stack Pointer (SP) − The 16-bit SP register provides the offset value within the program stack.

Base Pointer (BP) − The 16-bit BP register mainly helps in referencing the parameter 
variables passed to a subroutine.

# Index Registers

