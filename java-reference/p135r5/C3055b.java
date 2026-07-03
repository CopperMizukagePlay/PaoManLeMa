package p135r5;

import java.io.File;
import java.io.IOException;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: r5.b */
/* loaded from: classes.dex */
public class C3055b extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3055b(File file, File file2, String str) {
        super(r3);
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        sb.append(": ".concat(str));
        String sb2 = sb.toString();
        AbstractC3367j.m5099d(sb2, "toString(...)");
    }
}
