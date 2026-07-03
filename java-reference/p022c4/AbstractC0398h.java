package p022c4;

import p034e0.C0619n;
import p085l0.C2335a;
import p085l0.C2350d2;
import p085l0.InterfaceC2343c;
import p093m0.InterfaceC2528i0;
import p145t0.C3179j;
import p158u5.AbstractC3380w;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c4.h */
/* loaded from: classes.dex */
public abstract class AbstractC0398h {

    /* renamed from: a */
    public final /* synthetic */ int f1359a;

    /* renamed from: b */
    public final int f1360b;

    /* renamed from: c */
    public final int f1361c;

    public /* synthetic */ AbstractC0398h(int i7, int i8, int i9, byte b8) {
        this.f1359a = i9;
        this.f1360b = i7;
        this.f1361c = i8;
    }

    /* renamed from: a */
    public abstract void mo873a(C0619n c0619n, InterfaceC2343c interfaceC2343c, C2350d2 c2350d2, C3179j c3179j, InterfaceC2528i0 interfaceC2528i0);

    /* renamed from: b */
    public C2335a mo874b(C0619n c0619n) {
        return null;
    }

    /* renamed from: c */
    public abstract byte[] mo869c();

    /* renamed from: d */
    public abstract byte[] mo870d(int i7, byte[] bArr);

    /* renamed from: e */
    public boolean mo871e() {
        return false;
    }

    /* renamed from: f */
    public AbstractC0398h mo872f() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public final String toString() {
        char c7;
        switch (this.f1359a) {
            case 0:
                int i7 = this.f1360b;
                byte[] bArr = new byte[i7];
                int i8 = this.f1361c;
                StringBuilder sb = new StringBuilder((i7 + 1) * i8);
                for (int i9 = 0; i9 < i8; i9++) {
                    bArr = mo870d(i9, bArr);
                    for (int i10 = 0; i10 < i7; i10++) {
                        int i11 = bArr[i10] & 255;
                        if (i11 < 64) {
                            c7 = '#';
                        } else if (i11 < 128) {
                            c7 = '+';
                        } else if (i11 < 192) {
                            c7 = '.';
                        } else {
                            c7 = ' ';
                        }
                        sb.append(c7);
                    }
                    sb.append('\n');
                }
                return sb.toString();
            default:
                String m5093b = AbstractC3380w.m5108a(getClass()).m5093b();
                if (m5093b == null) {
                    return "";
                }
                return m5093b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC0398h(int i7, int i8, int i9) {
        this((i9 & 1) != 0 ? 0 : i7, (i9 & 2) != 0 ? 0 : i8, 1, (byte) 0);
        this.f1359a = 1;
    }
}
