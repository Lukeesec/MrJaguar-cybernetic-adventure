.intel_syntax noprefix
.bits 32
	
.global asm2

asm2(0x7,0x28) 

asm2:
	push   	ebp                        ;prologue
	mov    	ebp,esp                    ;prologue
	sub    	esp,0x10                   ;prologue
	mov    	eax,DWORD PTR [ebp+0xc]    ;move ebp+0x28 into eax
	mov 	DWORD PTR [ebp-0x4],eax    ;move eax into ebp-0x4
	mov    	eax,DWORD PTR [ebp+0x8]    ;move ebp+0x7 into eax
	mov	DWORD PTR [ebp-0x8],eax        ;move eax into ebp-0x8
	jmp    	part_b                     ;goto part_b
part_a:	
	add    	DWORD PTR [ebp-0x4],0x1    ;add 1 to ebp-0x41
	add	DWORD PTR [ebp+0x8],0x76       ;add 0x76 to ebp+0x8 (keeps adding 0x76 to ebp+0x8 -
		                               ; - untell its equal to or more then oxa1de)
part_b:	
	cmp    	DWORD PTR [ebp+0x8],0xa1de ;compare ebp+0x8 to oxa1de
	jle    	part_a                     ;jump if ebp+0x8 is less then or equal to oxa1de 
	mov    	eax,DWORD PTR [ebp-0x4]    ;move ebp-0x4 into eax (eax is our picoCTF{flag})
	mov	esp,ebp
	pop	ebp
	ret
