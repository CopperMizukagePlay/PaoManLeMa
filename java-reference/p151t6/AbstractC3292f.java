package p151t6;

import p006a7.C0129l;
import p006a7.C0130m;
import p024c6.AbstractC0451r;
import p092m.AbstractC2487d;
import p106n6.AbstractC2721b;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t6.f */
/* loaded from: classes.dex */
public abstract class AbstractC3292f {

    /* renamed from: a */
    public static final C0130m f16159a;

    /* renamed from: b */
    public static final String[] f16160b;

    /* renamed from: c */
    public static final String[] f16161c;

    /* renamed from: d */
    public static final String[] f16162d;

    static {
        C0130m c0130m = C0130m.f528h;
        f16159a = C0129l.m278g("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f16160b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f16161c = new String[64];
        String[] strArr = new String[256];
        for (int i7 = 0; i7 < 256; i7++) {
            String binaryString = Integer.toBinaryString(i7);
            AbstractC3367j.m5099d(binaryString, "toBinaryString(it)");
            String replace = AbstractC2721b.m4363i("%8s", binaryString).replace(' ', '0');
            AbstractC3367j.m5099d(replace, "replace(...)");
            strArr[i7] = replace;
        }
        f16162d = strArr;
        String[] strArr2 = f16161c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i8 = iArr[0];
        strArr2[i8 | 8] = AbstractC2487d.m4046j(new StringBuilder(), strArr2[i8], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i9 = 0; i9 < 3; i9++) {
            int i10 = iArr2[i9];
            int i11 = iArr[0];
            String[] strArr3 = f16161c;
            int i12 = i11 | i10;
            strArr3[i12] = strArr3[i11] + '|' + strArr3[i10];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i11]);
            sb.append('|');
            strArr3[i12 | 8] = AbstractC2487d.m4046j(sb, strArr3[i10], "|PADDED");
        }
        int length = f16161c.length;
        for (int i13 = 0; i13 < length; i13++) {
            String[] strArr4 = f16161c;
            if (strArr4[i13] == null) {
                strArr4[i13] = f16162d[i13];
            }
        }
    }

    /* renamed from: a */
    public static String m5005a(boolean z7, int i7, int i8, int i9, int i10) {
        String m4363i;
        String str;
        String str2;
        String str3;
        String[] strArr = f16160b;
        if (i9 < strArr.length) {
            m4363i = strArr[i9];
        } else {
            m4363i = AbstractC2721b.m4363i("0x%02x", Integer.valueOf(i9));
        }
        if (i10 == 0) {
            str = "";
        } else {
            String[] strArr2 = f16162d;
            if (i9 != 2 && i9 != 3) {
                if (i9 != 4 && i9 != 6) {
                    if (i9 != 7 && i9 != 8) {
                        String[] strArr3 = f16161c;
                        if (i10 < strArr3.length) {
                            str2 = strArr3[i10];
                            AbstractC3367j.m5097b(str2);
                        } else {
                            str2 = strArr2[i10];
                        }
                        if (i9 == 5 && (i10 & 4) != 0) {
                            str = AbstractC0451r.m969K(str2, "HEADERS", "PUSH_PROMISE");
                        } else if (i9 == 0 && (i10 & 32) != 0) {
                            str = AbstractC0451r.m969K(str2, "PRIORITY", "COMPRESSED");
                        } else {
                            str = str2;
                        }
                    }
                } else if (i10 == 1) {
                    str = "ACK";
                } else {
                    str = strArr2[i10];
                }
            }
            str = strArr2[i10];
        }
        if (z7) {
            str3 = "<<";
        } else {
            str3 = ">>";
        }
        return AbstractC2721b.m4363i("%s 0x%08x %5d %-13s %s", str3, Integer.valueOf(i7), Integer.valueOf(i8), m4363i, str);
    }
}
