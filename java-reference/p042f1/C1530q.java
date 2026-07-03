package p042f1;

import java.util.Arrays;
import p034e0.C0625q;
import p035e1.AbstractC0659i0;
import p144t.AbstractC3122c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: f1.q */
/* loaded from: classes.dex */
public final class C1530q extends AbstractC1516c {

    /* renamed from: r */
    public static final C0625q f10066r = new C0625q(10);

    /* renamed from: d */
    public final C1532s f10067d;

    /* renamed from: e */
    public final float f10068e;

    /* renamed from: f */
    public final float f10069f;

    /* renamed from: g */
    public final C1531r f10070g;

    /* renamed from: h */
    public final float[] f10071h;

    /* renamed from: i */
    public final float[] f10072i;

    /* renamed from: j */
    public final float[] f10073j;

    /* renamed from: k */
    public final InterfaceC1522i f10074k;

    /* renamed from: l */
    public final C1529p f10075l;

    /* renamed from: m */
    public final C1526m f10076m;

    /* renamed from: n */
    public final InterfaceC1522i f10077n;

    /* renamed from: o */
    public final C1529p f10078o;

    /* renamed from: p */
    public final C1526m f10079p;

    /* renamed from: q */
    public final boolean f10080q;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1530q(String str, float[] fArr, C1532s c1532s, final C1531r c1531r, int i7) {
        this(str, fArr, c1532s, null, r4, r0, 0.0f, 1.0f, c1531r, i7);
        InterfaceC1522i interfaceC1522i;
        InterfaceC1522i interfaceC1522i2;
        double d7 = c1531r.f10081a;
        boolean z7 = d7 == -3.0d;
        double d8 = c1531r.f10087g;
        double d9 = c1531r.f10086f;
        if (z7) {
            final int i8 = 4;
            interfaceC1522i = new InterfaceC1522i() { // from class: f1.o
                @Override // p042f1.InterfaceC1522i
                /* renamed from: c */
                public final double mo1297c(double d10) {
                    int i9 = i8;
                    C1531r c1531r2 = c1531r;
                    switch (i9) {
                        case 0:
                            float[] fArr2 = C1517d.f10015a;
                            return C1517d.m2449a(c1531r2, d10);
                        case 1:
                            float[] fArr3 = C1517d.f10015a;
                            return C1517d.m2451c(c1531r2, d10);
                        case 2:
                            double d11 = c1531r2.f10082b;
                            double d12 = c1531r2.f10083c;
                            double d13 = c1531r2.f10084d;
                            double d14 = c1531r2.f10085e;
                            double d15 = c1531r2.f10081a;
                            if (d10 >= d14) {
                                return Math.pow((d11 * d10) + d12, d15);
                            }
                            return d10 * d13;
                        case 3:
                            double d16 = c1531r2.f10082b;
                            double d17 = c1531r2.f10083c;
                            double d18 = c1531r2.f10084d;
                            double d19 = c1531r2.f10085e;
                            double d20 = c1531r2.f10086f;
                            double d21 = c1531r2.f10087g;
                            double d22 = c1531r2.f10081a;
                            if (d10 >= d19) {
                                return Math.pow((d16 * d10) + d17, d22) + d20;
                            }
                            return (d18 * d10) + d21;
                        case 4:
                            float[] fArr4 = C1517d.f10015a;
                            return C1517d.m2450b(c1531r2, d10);
                        case AbstractC3122c.f15761f /* 5 */:
                            float[] fArr5 = C1517d.f10015a;
                            return C1517d.m2452d(c1531r2, d10);
                        case AbstractC3122c.f15759d /* 6 */:
                            double d23 = c1531r2.f10082b;
                            double d24 = c1531r2.f10083c;
                            double d25 = c1531r2.f10084d;
                            double d26 = c1531r2.f10085e;
                            double d27 = c1531r2.f10081a;
                            if (d10 >= d26 * d25) {
                                return (Math.pow(d10, 1.0d / d27) - d24) / d23;
                            }
                            return d10 / d25;
                        default:
                            double d28 = c1531r2.f10082b;
                            double d29 = c1531r2.f10083c;
                            double d30 = c1531r2.f10084d;
                            double d31 = c1531r2.f10085e;
                            double d32 = c1531r2.f10086f;
                            double d33 = c1531r2.f10087g;
                            double d34 = c1531r2.f10081a;
                            if (d10 >= d31 * d30) {
                                return (Math.pow(d10 - d32, 1.0d / d34) - d29) / d28;
                            }
                            return (d10 - d33) / d30;
                    }
                }
            };
        } else if (d7 == -2.0d) {
            final int i9 = 5;
            interfaceC1522i = new InterfaceC1522i() { // from class: f1.o
                @Override // p042f1.InterfaceC1522i
                /* renamed from: c */
                public final double mo1297c(double d10) {
                    int i92 = i9;
                    C1531r c1531r2 = c1531r;
                    switch (i92) {
                        case 0:
                            float[] fArr2 = C1517d.f10015a;
                            return C1517d.m2449a(c1531r2, d10);
                        case 1:
                            float[] fArr3 = C1517d.f10015a;
                            return C1517d.m2451c(c1531r2, d10);
                        case 2:
                            double d11 = c1531r2.f10082b;
                            double d12 = c1531r2.f10083c;
                            double d13 = c1531r2.f10084d;
                            double d14 = c1531r2.f10085e;
                            double d15 = c1531r2.f10081a;
                            if (d10 >= d14) {
                                return Math.pow((d11 * d10) + d12, d15);
                            }
                            return d10 * d13;
                        case 3:
                            double d16 = c1531r2.f10082b;
                            double d17 = c1531r2.f10083c;
                            double d18 = c1531r2.f10084d;
                            double d19 = c1531r2.f10085e;
                            double d20 = c1531r2.f10086f;
                            double d21 = c1531r2.f10087g;
                            double d22 = c1531r2.f10081a;
                            if (d10 >= d19) {
                                return Math.pow((d16 * d10) + d17, d22) + d20;
                            }
                            return (d18 * d10) + d21;
                        case 4:
                            float[] fArr4 = C1517d.f10015a;
                            return C1517d.m2450b(c1531r2, d10);
                        case AbstractC3122c.f15761f /* 5 */:
                            float[] fArr5 = C1517d.f10015a;
                            return C1517d.m2452d(c1531r2, d10);
                        case AbstractC3122c.f15759d /* 6 */:
                            double d23 = c1531r2.f10082b;
                            double d24 = c1531r2.f10083c;
                            double d25 = c1531r2.f10084d;
                            double d26 = c1531r2.f10085e;
                            double d27 = c1531r2.f10081a;
                            if (d10 >= d26 * d25) {
                                return (Math.pow(d10, 1.0d / d27) - d24) / d23;
                            }
                            return d10 / d25;
                        default:
                            double d28 = c1531r2.f10082b;
                            double d29 = c1531r2.f10083c;
                            double d30 = c1531r2.f10084d;
                            double d31 = c1531r2.f10085e;
                            double d32 = c1531r2.f10086f;
                            double d33 = c1531r2.f10087g;
                            double d34 = c1531r2.f10081a;
                            if (d10 >= d31 * d30) {
                                return (Math.pow(d10 - d32, 1.0d / d34) - d29) / d28;
                            }
                            return (d10 - d33) / d30;
                    }
                }
            };
        } else if (d9 == 0.0d && d8 == 0.0d) {
            final int i10 = 6;
            interfaceC1522i = new InterfaceC1522i() { // from class: f1.o
                @Override // p042f1.InterfaceC1522i
                /* renamed from: c */
                public final double mo1297c(double d10) {
                    int i92 = i10;
                    C1531r c1531r2 = c1531r;
                    switch (i92) {
                        case 0:
                            float[] fArr2 = C1517d.f10015a;
                            return C1517d.m2449a(c1531r2, d10);
                        case 1:
                            float[] fArr3 = C1517d.f10015a;
                            return C1517d.m2451c(c1531r2, d10);
                        case 2:
                            double d11 = c1531r2.f10082b;
                            double d12 = c1531r2.f10083c;
                            double d13 = c1531r2.f10084d;
                            double d14 = c1531r2.f10085e;
                            double d15 = c1531r2.f10081a;
                            if (d10 >= d14) {
                                return Math.pow((d11 * d10) + d12, d15);
                            }
                            return d10 * d13;
                        case 3:
                            double d16 = c1531r2.f10082b;
                            double d17 = c1531r2.f10083c;
                            double d18 = c1531r2.f10084d;
                            double d19 = c1531r2.f10085e;
                            double d20 = c1531r2.f10086f;
                            double d21 = c1531r2.f10087g;
                            double d22 = c1531r2.f10081a;
                            if (d10 >= d19) {
                                return Math.pow((d16 * d10) + d17, d22) + d20;
                            }
                            return (d18 * d10) + d21;
                        case 4:
                            float[] fArr4 = C1517d.f10015a;
                            return C1517d.m2450b(c1531r2, d10);
                        case AbstractC3122c.f15761f /* 5 */:
                            float[] fArr5 = C1517d.f10015a;
                            return C1517d.m2452d(c1531r2, d10);
                        case AbstractC3122c.f15759d /* 6 */:
                            double d23 = c1531r2.f10082b;
                            double d24 = c1531r2.f10083c;
                            double d25 = c1531r2.f10084d;
                            double d26 = c1531r2.f10085e;
                            double d27 = c1531r2.f10081a;
                            if (d10 >= d26 * d25) {
                                return (Math.pow(d10, 1.0d / d27) - d24) / d23;
                            }
                            return d10 / d25;
                        default:
                            double d28 = c1531r2.f10082b;
                            double d29 = c1531r2.f10083c;
                            double d30 = c1531r2.f10084d;
                            double d31 = c1531r2.f10085e;
                            double d32 = c1531r2.f10086f;
                            double d33 = c1531r2.f10087g;
                            double d34 = c1531r2.f10081a;
                            if (d10 >= d31 * d30) {
                                return (Math.pow(d10 - d32, 1.0d / d34) - d29) / d28;
                            }
                            return (d10 - d33) / d30;
                    }
                }
            };
        } else {
            final int i11 = 7;
            interfaceC1522i = new InterfaceC1522i() { // from class: f1.o
                @Override // p042f1.InterfaceC1522i
                /* renamed from: c */
                public final double mo1297c(double d10) {
                    int i92 = i11;
                    C1531r c1531r2 = c1531r;
                    switch (i92) {
                        case 0:
                            float[] fArr2 = C1517d.f10015a;
                            return C1517d.m2449a(c1531r2, d10);
                        case 1:
                            float[] fArr3 = C1517d.f10015a;
                            return C1517d.m2451c(c1531r2, d10);
                        case 2:
                            double d11 = c1531r2.f10082b;
                            double d12 = c1531r2.f10083c;
                            double d13 = c1531r2.f10084d;
                            double d14 = c1531r2.f10085e;
                            double d15 = c1531r2.f10081a;
                            if (d10 >= d14) {
                                return Math.pow((d11 * d10) + d12, d15);
                            }
                            return d10 * d13;
                        case 3:
                            double d16 = c1531r2.f10082b;
                            double d17 = c1531r2.f10083c;
                            double d18 = c1531r2.f10084d;
                            double d19 = c1531r2.f10085e;
                            double d20 = c1531r2.f10086f;
                            double d21 = c1531r2.f10087g;
                            double d22 = c1531r2.f10081a;
                            if (d10 >= d19) {
                                return Math.pow((d16 * d10) + d17, d22) + d20;
                            }
                            return (d18 * d10) + d21;
                        case 4:
                            float[] fArr4 = C1517d.f10015a;
                            return C1517d.m2450b(c1531r2, d10);
                        case AbstractC3122c.f15761f /* 5 */:
                            float[] fArr5 = C1517d.f10015a;
                            return C1517d.m2452d(c1531r2, d10);
                        case AbstractC3122c.f15759d /* 6 */:
                            double d23 = c1531r2.f10082b;
                            double d24 = c1531r2.f10083c;
                            double d25 = c1531r2.f10084d;
                            double d26 = c1531r2.f10085e;
                            double d27 = c1531r2.f10081a;
                            if (d10 >= d26 * d25) {
                                return (Math.pow(d10, 1.0d / d27) - d24) / d23;
                            }
                            return d10 / d25;
                        default:
                            double d28 = c1531r2.f10082b;
                            double d29 = c1531r2.f10083c;
                            double d30 = c1531r2.f10084d;
                            double d31 = c1531r2.f10085e;
                            double d32 = c1531r2.f10086f;
                            double d33 = c1531r2.f10087g;
                            double d34 = c1531r2.f10081a;
                            if (d10 >= d31 * d30) {
                                return (Math.pow(d10 - d32, 1.0d / d34) - d29) / d28;
                            }
                            return (d10 - d33) / d30;
                    }
                }
            };
        }
        if (d7 == -3.0d) {
            final int i12 = 0;
            interfaceC1522i2 = new InterfaceC1522i() { // from class: f1.o
                @Override // p042f1.InterfaceC1522i
                /* renamed from: c */
                public final double mo1297c(double d10) {
                    int i92 = i12;
                    C1531r c1531r2 = c1531r;
                    switch (i92) {
                        case 0:
                            float[] fArr2 = C1517d.f10015a;
                            return C1517d.m2449a(c1531r2, d10);
                        case 1:
                            float[] fArr3 = C1517d.f10015a;
                            return C1517d.m2451c(c1531r2, d10);
                        case 2:
                            double d11 = c1531r2.f10082b;
                            double d12 = c1531r2.f10083c;
                            double d13 = c1531r2.f10084d;
                            double d14 = c1531r2.f10085e;
                            double d15 = c1531r2.f10081a;
                            if (d10 >= d14) {
                                return Math.pow((d11 * d10) + d12, d15);
                            }
                            return d10 * d13;
                        case 3:
                            double d16 = c1531r2.f10082b;
                            double d17 = c1531r2.f10083c;
                            double d18 = c1531r2.f10084d;
                            double d19 = c1531r2.f10085e;
                            double d20 = c1531r2.f10086f;
                            double d21 = c1531r2.f10087g;
                            double d22 = c1531r2.f10081a;
                            if (d10 >= d19) {
                                return Math.pow((d16 * d10) + d17, d22) + d20;
                            }
                            return (d18 * d10) + d21;
                        case 4:
                            float[] fArr4 = C1517d.f10015a;
                            return C1517d.m2450b(c1531r2, d10);
                        case AbstractC3122c.f15761f /* 5 */:
                            float[] fArr5 = C1517d.f10015a;
                            return C1517d.m2452d(c1531r2, d10);
                        case AbstractC3122c.f15759d /* 6 */:
                            double d23 = c1531r2.f10082b;
                            double d24 = c1531r2.f10083c;
                            double d25 = c1531r2.f10084d;
                            double d26 = c1531r2.f10085e;
                            double d27 = c1531r2.f10081a;
                            if (d10 >= d26 * d25) {
                                return (Math.pow(d10, 1.0d / d27) - d24) / d23;
                            }
                            return d10 / d25;
                        default:
                            double d28 = c1531r2.f10082b;
                            double d29 = c1531r2.f10083c;
                            double d30 = c1531r2.f10084d;
                            double d31 = c1531r2.f10085e;
                            double d32 = c1531r2.f10086f;
                            double d33 = c1531r2.f10087g;
                            double d34 = c1531r2.f10081a;
                            if (d10 >= d31 * d30) {
                                return (Math.pow(d10 - d32, 1.0d / d34) - d29) / d28;
                            }
                            return (d10 - d33) / d30;
                    }
                }
            };
        } else if (d7 == -2.0d) {
            final int i13 = 1;
            interfaceC1522i2 = new InterfaceC1522i() { // from class: f1.o
                @Override // p042f1.InterfaceC1522i
                /* renamed from: c */
                public final double mo1297c(double d10) {
                    int i92 = i13;
                    C1531r c1531r2 = c1531r;
                    switch (i92) {
                        case 0:
                            float[] fArr2 = C1517d.f10015a;
                            return C1517d.m2449a(c1531r2, d10);
                        case 1:
                            float[] fArr3 = C1517d.f10015a;
                            return C1517d.m2451c(c1531r2, d10);
                        case 2:
                            double d11 = c1531r2.f10082b;
                            double d12 = c1531r2.f10083c;
                            double d13 = c1531r2.f10084d;
                            double d14 = c1531r2.f10085e;
                            double d15 = c1531r2.f10081a;
                            if (d10 >= d14) {
                                return Math.pow((d11 * d10) + d12, d15);
                            }
                            return d10 * d13;
                        case 3:
                            double d16 = c1531r2.f10082b;
                            double d17 = c1531r2.f10083c;
                            double d18 = c1531r2.f10084d;
                            double d19 = c1531r2.f10085e;
                            double d20 = c1531r2.f10086f;
                            double d21 = c1531r2.f10087g;
                            double d22 = c1531r2.f10081a;
                            if (d10 >= d19) {
                                return Math.pow((d16 * d10) + d17, d22) + d20;
                            }
                            return (d18 * d10) + d21;
                        case 4:
                            float[] fArr4 = C1517d.f10015a;
                            return C1517d.m2450b(c1531r2, d10);
                        case AbstractC3122c.f15761f /* 5 */:
                            float[] fArr5 = C1517d.f10015a;
                            return C1517d.m2452d(c1531r2, d10);
                        case AbstractC3122c.f15759d /* 6 */:
                            double d23 = c1531r2.f10082b;
                            double d24 = c1531r2.f10083c;
                            double d25 = c1531r2.f10084d;
                            double d26 = c1531r2.f10085e;
                            double d27 = c1531r2.f10081a;
                            if (d10 >= d26 * d25) {
                                return (Math.pow(d10, 1.0d / d27) - d24) / d23;
                            }
                            return d10 / d25;
                        default:
                            double d28 = c1531r2.f10082b;
                            double d29 = c1531r2.f10083c;
                            double d30 = c1531r2.f10084d;
                            double d31 = c1531r2.f10085e;
                            double d32 = c1531r2.f10086f;
                            double d33 = c1531r2.f10087g;
                            double d34 = c1531r2.f10081a;
                            if (d10 >= d31 * d30) {
                                return (Math.pow(d10 - d32, 1.0d / d34) - d29) / d28;
                            }
                            return (d10 - d33) / d30;
                    }
                }
            };
        } else if (d9 == 0.0d && d8 == 0.0d) {
            final int i14 = 2;
            interfaceC1522i2 = new InterfaceC1522i() { // from class: f1.o
                @Override // p042f1.InterfaceC1522i
                /* renamed from: c */
                public final double mo1297c(double d10) {
                    int i92 = i14;
                    C1531r c1531r2 = c1531r;
                    switch (i92) {
                        case 0:
                            float[] fArr2 = C1517d.f10015a;
                            return C1517d.m2449a(c1531r2, d10);
                        case 1:
                            float[] fArr3 = C1517d.f10015a;
                            return C1517d.m2451c(c1531r2, d10);
                        case 2:
                            double d11 = c1531r2.f10082b;
                            double d12 = c1531r2.f10083c;
                            double d13 = c1531r2.f10084d;
                            double d14 = c1531r2.f10085e;
                            double d15 = c1531r2.f10081a;
                            if (d10 >= d14) {
                                return Math.pow((d11 * d10) + d12, d15);
                            }
                            return d10 * d13;
                        case 3:
                            double d16 = c1531r2.f10082b;
                            double d17 = c1531r2.f10083c;
                            double d18 = c1531r2.f10084d;
                            double d19 = c1531r2.f10085e;
                            double d20 = c1531r2.f10086f;
                            double d21 = c1531r2.f10087g;
                            double d22 = c1531r2.f10081a;
                            if (d10 >= d19) {
                                return Math.pow((d16 * d10) + d17, d22) + d20;
                            }
                            return (d18 * d10) + d21;
                        case 4:
                            float[] fArr4 = C1517d.f10015a;
                            return C1517d.m2450b(c1531r2, d10);
                        case AbstractC3122c.f15761f /* 5 */:
                            float[] fArr5 = C1517d.f10015a;
                            return C1517d.m2452d(c1531r2, d10);
                        case AbstractC3122c.f15759d /* 6 */:
                            double d23 = c1531r2.f10082b;
                            double d24 = c1531r2.f10083c;
                            double d25 = c1531r2.f10084d;
                            double d26 = c1531r2.f10085e;
                            double d27 = c1531r2.f10081a;
                            if (d10 >= d26 * d25) {
                                return (Math.pow(d10, 1.0d / d27) - d24) / d23;
                            }
                            return d10 / d25;
                        default:
                            double d28 = c1531r2.f10082b;
                            double d29 = c1531r2.f10083c;
                            double d30 = c1531r2.f10084d;
                            double d31 = c1531r2.f10085e;
                            double d32 = c1531r2.f10086f;
                            double d33 = c1531r2.f10087g;
                            double d34 = c1531r2.f10081a;
                            if (d10 >= d31 * d30) {
                                return (Math.pow(d10 - d32, 1.0d / d34) - d29) / d28;
                            }
                            return (d10 - d33) / d30;
                    }
                }
            };
        } else {
            final int i15 = 3;
            interfaceC1522i2 = new InterfaceC1522i() { // from class: f1.o
                @Override // p042f1.InterfaceC1522i
                /* renamed from: c */
                public final double mo1297c(double d10) {
                    int i92 = i15;
                    C1531r c1531r2 = c1531r;
                    switch (i92) {
                        case 0:
                            float[] fArr2 = C1517d.f10015a;
                            return C1517d.m2449a(c1531r2, d10);
                        case 1:
                            float[] fArr3 = C1517d.f10015a;
                            return C1517d.m2451c(c1531r2, d10);
                        case 2:
                            double d11 = c1531r2.f10082b;
                            double d12 = c1531r2.f10083c;
                            double d13 = c1531r2.f10084d;
                            double d14 = c1531r2.f10085e;
                            double d15 = c1531r2.f10081a;
                            if (d10 >= d14) {
                                return Math.pow((d11 * d10) + d12, d15);
                            }
                            return d10 * d13;
                        case 3:
                            double d16 = c1531r2.f10082b;
                            double d17 = c1531r2.f10083c;
                            double d18 = c1531r2.f10084d;
                            double d19 = c1531r2.f10085e;
                            double d20 = c1531r2.f10086f;
                            double d21 = c1531r2.f10087g;
                            double d22 = c1531r2.f10081a;
                            if (d10 >= d19) {
                                return Math.pow((d16 * d10) + d17, d22) + d20;
                            }
                            return (d18 * d10) + d21;
                        case 4:
                            float[] fArr4 = C1517d.f10015a;
                            return C1517d.m2450b(c1531r2, d10);
                        case AbstractC3122c.f15761f /* 5 */:
                            float[] fArr5 = C1517d.f10015a;
                            return C1517d.m2452d(c1531r2, d10);
                        case AbstractC3122c.f15759d /* 6 */:
                            double d23 = c1531r2.f10082b;
                            double d24 = c1531r2.f10083c;
                            double d25 = c1531r2.f10084d;
                            double d26 = c1531r2.f10085e;
                            double d27 = c1531r2.f10081a;
                            if (d10 >= d26 * d25) {
                                return (Math.pow(d10, 1.0d / d27) - d24) / d23;
                            }
                            return d10 / d25;
                        default:
                            double d28 = c1531r2.f10082b;
                            double d29 = c1531r2.f10083c;
                            double d30 = c1531r2.f10084d;
                            double d31 = c1531r2.f10085e;
                            double d32 = c1531r2.f10086f;
                            double d33 = c1531r2.f10087g;
                            double d34 = c1531r2.f10081a;
                            if (d10 >= d31 * d30) {
                                return (Math.pow(d10 - d32, 1.0d / d34) - d29) / d28;
                            }
                            return (d10 - d33) / d30;
                    }
                }
            };
        }
    }

    @Override // p042f1.AbstractC1516c
    /* renamed from: a */
    public final float mo2443a(int i7) {
        return this.f10069f;
    }

    @Override // p042f1.AbstractC1516c
    /* renamed from: b */
    public final float mo2444b(int i7) {
        return this.f10068e;
    }

    @Override // p042f1.AbstractC1516c
    /* renamed from: c */
    public final boolean mo2445c() {
        return this.f10080q;
    }

    @Override // p042f1.AbstractC1516c
    /* renamed from: d */
    public final long mo2446d(float f7, float f8, float f9) {
        double d7 = f7;
        C1526m c1526m = this.f10079p;
        float mo1297c = (float) c1526m.mo1297c(d7);
        float mo1297c2 = (float) c1526m.mo1297c(f8);
        float mo1297c3 = (float) c1526m.mo1297c(f9);
        float[] fArr = this.f10072i;
        if (fArr.length < 9) {
            return 0L;
        }
        float f10 = (fArr[6] * mo1297c3) + (fArr[3] * mo1297c2) + (fArr[0] * mo1297c);
        float f11 = (fArr[7] * mo1297c3) + (fArr[4] * mo1297c2) + (fArr[1] * mo1297c);
        return (Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    @Override // p042f1.AbstractC1516c
    /* renamed from: e */
    public final float mo2447e(float f7, float f8, float f9) {
        double d7 = f7;
        C1526m c1526m = this.f10079p;
        float mo1297c = (float) c1526m.mo1297c(d7);
        float mo1297c2 = (float) c1526m.mo1297c(f8);
        float mo1297c3 = (float) c1526m.mo1297c(f9);
        float[] fArr = this.f10072i;
        return (fArr[8] * mo1297c3) + (fArr[5] * mo1297c2) + (fArr[2] * mo1297c);
    }

    @Override // p042f1.AbstractC1516c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1530q.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C1530q c1530q = (C1530q) obj;
        C1531r c1531r = c1530q.f10070g;
        if (Float.compare(c1530q.f10068e, this.f10068e) != 0 || Float.compare(c1530q.f10069f, this.f10069f) != 0 || !AbstractC3367j.m5096a(this.f10067d, c1530q.f10067d) || !Arrays.equals(this.f10071h, c1530q.f10071h)) {
            return false;
        }
        C1531r c1531r2 = this.f10070g;
        if (c1531r2 != null) {
            return AbstractC3367j.m5096a(c1531r2, c1531r);
        }
        if (c1531r == null) {
            return true;
        }
        if (!AbstractC3367j.m5096a(this.f10074k, c1530q.f10074k)) {
            return false;
        }
        return AbstractC3367j.m5096a(this.f10077n, c1530q.f10077n);
    }

    @Override // p042f1.AbstractC1516c
    /* renamed from: f */
    public final long mo2448f(float f7, float f8, float f9, float f10, AbstractC1516c abstractC1516c) {
        float[] fArr = this.f10073j;
        float f11 = (fArr[6] * f9) + (fArr[3] * f8) + (fArr[0] * f7);
        float f12 = (fArr[7] * f9) + (fArr[4] * f8) + (fArr[1] * f7);
        float f13 = (fArr[8] * f9) + (fArr[5] * f8) + (fArr[2] * f7);
        C1526m c1526m = this.f10076m;
        return AbstractC0659i0.m1402b((float) c1526m.mo1297c(f11), (float) c1526m.mo1297c(f12), (float) c1526m.mo1297c(f13), f10, abstractC1516c);
    }

    @Override // p042f1.AbstractC1516c
    public final int hashCode() {
        int floatToIntBits;
        int floatToIntBits2;
        int hashCode = (Arrays.hashCode(this.f10071h) + ((this.f10067d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f7 = this.f10068e;
        int i7 = 0;
        if (f7 == 0.0f) {
            floatToIntBits = 0;
        } else {
            floatToIntBits = Float.floatToIntBits(f7);
        }
        int i8 = (hashCode + floatToIntBits) * 31;
        float f8 = this.f10069f;
        if (f8 == 0.0f) {
            floatToIntBits2 = 0;
        } else {
            floatToIntBits2 = Float.floatToIntBits(f8);
        }
        int i9 = (i8 + floatToIntBits2) * 31;
        C1531r c1531r = this.f10070g;
        if (c1531r != null) {
            i7 = c1531r.hashCode();
        }
        int i10 = i9 + i7;
        if (c1531r == null) {
            return this.f10077n.hashCode() + ((this.f10074k.hashCode() + (i10 * 31)) * 31);
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x01e2, code lost:
    
        if ((((r25 - r12) * r3) - ((r1 - r15) * r11)) >= 0.0f) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r41v1 */
    /* JADX WARN: Type inference failed for: r41v2 */
    /* JADX WARN: Type inference failed for: r41v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1530q(String str, float[] fArr, C1532s c1532s, float[] fArr2, InterfaceC1522i interfaceC1522i, InterfaceC1522i interfaceC1522i2, float f7, float f8, C1531r c1531r, int i7) {
        super(str, AbstractC1515b.f10007a, i7);
        ?? r41;
        float f9;
        float f10;
        this.f10067d = c1532s;
        this.f10068e = f7;
        this.f10069f = f8;
        this.f10070g = c1531r;
        this.f10074k = interfaceC1522i;
        boolean z7 = true;
        z7 = true;
        this.f10075l = new C1529p(this, z7 ? 1 : 0);
        int i8 = 0;
        this.f10076m = new C1526m(this, i8);
        this.f10077n = interfaceC1522i2;
        this.f10078o = new C1529p(this, i8);
        this.f10079p = new C1526m(this, z7 ? 1 : 0);
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f7 < f8) {
            float[] fArr3 = new float[6];
            if (fArr.length == 9) {
                float f11 = fArr[0];
                float f12 = fArr[1];
                float f13 = f11 + f12 + fArr[2];
                fArr3[0] = f11 / f13;
                fArr3[1] = f12 / f13;
                float f14 = fArr[3];
                float f15 = fArr[4];
                float f16 = f14 + f15 + fArr[5];
                fArr3[2] = f14 / f16;
                fArr3[3] = f15 / f16;
                float f17 = fArr[6];
                float f18 = fArr[7];
                float f19 = f17 + f18 + fArr[8];
                fArr3[4] = f17 / f19;
                fArr3[5] = f18 / f19;
            } else {
                System.arraycopy(fArr, 0, fArr3, 0, 6);
            }
            this.f10071h = fArr3;
            if (fArr2 == null) {
                float f20 = fArr3[0];
                float f21 = fArr3[1];
                float f22 = fArr3[2];
                float f23 = fArr3[3];
                float f24 = fArr3[4];
                float f25 = fArr3[5];
                f9 = 1.0f;
                float f26 = c1532s.f10088a;
                r41 = 0;
                float f27 = c1532s.f10089b;
                float f28 = 1;
                float f29 = (f28 - f20) / f21;
                float f30 = (f28 - f22) / f23;
                float f31 = (f28 - f24) / f25;
                float f32 = (f28 - f26) / f27;
                float f33 = f20 / f21;
                float f34 = (f22 / f23) - f33;
                float f35 = (f26 / f27) - f33;
                float f36 = f30 - f29;
                float f37 = (f24 / f25) - f33;
                float f38 = (((f32 - f29) * f34) - (f35 * f36)) / (((f31 - f29) * f34) - (f36 * f37));
                float f39 = (f35 - (f37 * f38)) / f34;
                float f40 = (1.0f - f39) - f38;
                float f41 = f40 / f21;
                float f42 = f39 / f23;
                float f43 = f38 / f25;
                this.f10072i = new float[]{f41 * f20, f40, ((1.0f - f20) - f21) * f41, f42 * f22, f39, ((1.0f - f22) - f23) * f42, f43 * f24, f38, ((1.0f - f24) - f25) * f43};
            } else {
                r41 = 0;
                f9 = 1.0f;
                if (fArr2.length == 9) {
                    this.f10072i = fArr2;
                } else {
                    throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
                }
            }
            this.f10073j = AbstractC1523j.m2459f(this.f10072i);
            float m2455b = AbstractC1523j.m2455b(fArr3);
            float[] fArr4 = C1517d.f10015a;
            if (m2455b / AbstractC1523j.m2455b(C1517d.f10016b) > 0.9f) {
                float[] fArr5 = C1517d.f10015a;
                float f44 = fArr3[r41];
                float f45 = fArr5[r41];
                float f46 = fArr3[1];
                float f47 = fArr5[1];
                float f48 = fArr3[2];
                float f49 = fArr5[2];
                float f50 = fArr3[3];
                float f51 = fArr5[3];
                float f52 = fArr3[4];
                float f53 = fArr5[4];
                float f54 = fArr3[5];
                float f55 = fArr5[5];
                f10 = 0.0f;
                float[] fArr6 = new float[6];
                fArr6[r41] = f44 - f45;
                fArr6[1] = f46 - f47;
                fArr6[2] = f48 - f49;
                fArr6[3] = f50 - f51;
                fArr6[4] = f52 - f53;
                fArr6[5] = f54 - f55;
                float f56 = fArr6[r41];
                float f57 = fArr6[1];
                if (((f47 - f55) * f56) - ((f45 - f53) * f57) >= 0.0f && ((f45 - f49) * f57) - ((f47 - f51) * f56) >= 0.0f) {
                    float f58 = fArr6[2];
                    float f59 = fArr6[3];
                    if (((f51 - f47) * f58) - ((f49 - f45) * f59) >= 0.0f && ((f49 - f53) * f59) - ((f51 - f55) * f58) >= 0.0f) {
                        float f60 = fArr6[4];
                        float f61 = fArr6[5];
                        if (((f55 - f51) * f60) - ((f53 - f49) * f61) >= 0.0f) {
                        }
                    }
                }
            } else {
                f10 = 0.0f;
            }
            int i9 = (f7 > f10 ? 1 : (f7 == f10 ? 0 : -1));
            if (i7 != 0) {
                float[] fArr7 = C1517d.f10015a;
                if (fArr3 != fArr7) {
                    for (int i10 = r41; i10 < 6; i10++) {
                        if (Float.compare(fArr3[i10], fArr7[i10]) != 0 && Math.abs(fArr3[i10] - fArr7[i10]) > 0.001f) {
                            break;
                        }
                    }
                }
                if (AbstractC1523j.m2457d(c1532s, AbstractC1523j.f10051d) && f7 == f10 && f8 == f9) {
                    float[] fArr8 = C1517d.f10015a;
                    C1530q c1530q = C1517d.f10019e;
                    for (double d7 = 0.0d; d7 <= 1.0d; d7 += 0.00392156862745098d) {
                        if (Math.abs(interfaceC1522i.mo1297c(d7) - c1530q.f10074k.mo1297c(d7)) <= 0.001d && Math.abs(interfaceC1522i2.mo1297c(d7) - c1530q.f10077n.mo1297c(d7)) <= 0.001d) {
                        }
                    }
                }
                z7 = r41;
            }
            this.f10080q = z7;
            return;
        }
        throw new IllegalArgumentException("Invalid range: min=" + f7 + ", max=" + f8 + "; min must be strictly < max");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1530q(String str, float[] fArr, C1532s c1532s, final double d7, float f7, float f8, int i7) {
        this(str, fArr, c1532s, null, r11, r12, f7, f8, new C1531r(d7, 1.0d, 0.0d, 0.0d, 0.0d), i7);
        InterfaceC1522i interfaceC1522i;
        InterfaceC1522i interfaceC1522i2 = f10066r;
        if (d7 == 1.0d) {
            interfaceC1522i = interfaceC1522i2;
        } else {
            final int i8 = 0;
            interfaceC1522i = new InterfaceC1522i() { // from class: f1.n
                @Override // p042f1.InterfaceC1522i
                /* renamed from: c */
                public final double mo1297c(double d8) {
                    switch (i8) {
                        case 0:
                            if (d8 < 0.0d) {
                                d8 = 0.0d;
                            }
                            return Math.pow(d8, 1.0d / d7);
                        default:
                            if (d8 < 0.0d) {
                                d8 = 0.0d;
                            }
                            return Math.pow(d8, d7);
                    }
                }
            };
        }
        if (d7 != 1.0d) {
            final int i9 = 1;
            interfaceC1522i2 = new InterfaceC1522i() { // from class: f1.n
                @Override // p042f1.InterfaceC1522i
                /* renamed from: c */
                public final double mo1297c(double d8) {
                    switch (i9) {
                        case 0:
                            if (d8 < 0.0d) {
                                d8 = 0.0d;
                            }
                            return Math.pow(d8, 1.0d / d7);
                        default:
                            if (d8 < 0.0d) {
                                d8 = 0.0d;
                            }
                            return Math.pow(d8, d7);
                    }
                }
            };
        }
        InterfaceC1522i interfaceC1522i3 = interfaceC1522i2;
    }
}
