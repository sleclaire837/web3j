package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Fixed;

/**
 * Auto generated code.
 * <p><strong>Do not modifiy!</strong>
 * <p>Please use org.web3j.codegen.AbiTypesGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 */
public class Fixed48x96 extends Fixed {
    public static final Fixed48x96 DEFAULT = new Fixed48x96(BigInteger.ZERO);

    public Fixed48x96(BigInteger value) {
        super(48, 96, value);
    }

    public Fixed48x96(int mBitSize, int nBitSize, BigInteger m, BigInteger n) {
        super(48, 96, m, n);
    }
}
