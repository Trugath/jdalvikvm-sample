package com.github.trugath.jdvmsample;

import com.github.trugath.jdalvikvm.VirtualMachine;

import java.io.IOException;

public final class Sample {

	public static void main(final String[] args) {

        final String dexFilename = "/App.dex";
		final String absoluteMainClassName = "tutorial1.HelloWorld";

        try {
            final VirtualMachine vm = new VirtualMachine();
            vm.load(Util.slurpBytesFromResource(dexFilename));
            vm.run(absoluteMainClassName, new String[0]);
        } catch (IOException e) {
            System.err.println("Unable to run " + dexFilename);
        }
	}
}
