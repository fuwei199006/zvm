package com.zvm.instruction.methodinvocation;

import com.zvm.instruction.Instruction;
import com.zvm.interpreter.CallSite;
import com.zvm.interpreter.CodeUtils;
import com.zvm.interpreter.Interpreter;
import com.zvm.runtime.JThread;
import com.zvm.runtime.JavaClass;
import com.zvm.runtime.RunTimeEnv;

public class InvokeDynamic implements Instruction {
    @Override
    public void execute(RunTimeEnv runTimeEnv, JThread jThread, JavaClass javaClass, CallSite callSite, Interpreter interpreter, CodeUtils code) {

    }
}
