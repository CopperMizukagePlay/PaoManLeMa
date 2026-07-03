package p151t6;

import java.io.IOException;
import p001a0.AbstractC0094y0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t6.q */
/* loaded from: classes.dex */
public abstract class AbstractC3303q {
    /* renamed from: a */
    public static int m5014a(int i7, int i8, int i9) {
        if ((i8 & 8) != 0) {
            i7--;
        }
        if (i9 <= i7) {
            return i7 - i9;
        }
        throw new IOException(AbstractC0094y0.m182i(i9, i7, "PROTOCOL_ERROR padding ", " > remaining length "));
    }
}
