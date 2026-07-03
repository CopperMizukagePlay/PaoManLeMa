package p035e1;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.DisplayMetrics;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import p023c5.C0427s;
import p027d1.C0465c;
import p027d1.C0466d;
import p042f1.AbstractC1515b;
import p042f1.AbstractC1516c;
import p042f1.C1517d;
import p042f1.C1525l;
import p042f1.C1526m;
import p042f1.C1530q;
import p049g1.C1573g;
import p049g1.InterfaceC1570d;
import p060h5.AbstractC1806n;
import p068i5.AbstractC2080d;
import p140s2.C3101k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e1.i0 */
/* loaded from: classes.dex */
public abstract class AbstractC0659i0 {

    /* renamed from: a */
    public static final C0657h0 f2147a = new Object();

    /* renamed from: b */
    public static Method f2148b;

    /* renamed from: c */
    public static Method f2149c;

    /* renamed from: d */
    public static boolean f2150d;

    /* renamed from: A */
    public static final Bitmap.Config m1394A(int i7) {
        if (i7 == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i7 == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i7 == 2) {
            return Bitmap.Config.RGB_565;
        }
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 26 && i7 == 3) {
            return AbstractC0656h.m1371e();
        }
        if (i8 >= 26 && i7 == 4) {
            return AbstractC0656h.m1363A();
        }
        return Bitmap.Config.ARGB_8888;
    }

    /* renamed from: B */
    public static final C0465c m1395B(Rect rect) {
        return new C0465c(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: C */
    public static final C0465c m1396C(RectF rectF) {
        return new C0465c(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* renamed from: D */
    public static final PorterDuff.Mode m1397D(int i7) {
        if (i7 == 0) {
            return PorterDuff.Mode.CLEAR;
        }
        if (i7 == 1) {
            return PorterDuff.Mode.SRC;
        }
        if (i7 == 2) {
            return PorterDuff.Mode.DST;
        }
        if (i7 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i7 == 4) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (i7 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i7 == 6) {
            return PorterDuff.Mode.DST_IN;
        }
        if (i7 == 7) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (i7 == 8) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (i7 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (i7 == 10) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (i7 == 11) {
            return PorterDuff.Mode.XOR;
        }
        if (i7 == 12) {
            return PorterDuff.Mode.ADD;
        }
        if (i7 == 14) {
            return PorterDuff.Mode.SCREEN;
        }
        if (i7 == 15) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (i7 == 16) {
            return PorterDuff.Mode.DARKEN;
        }
        if (i7 == 17) {
            return PorterDuff.Mode.LIGHTEN;
        }
        if (i7 == 13) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    /* renamed from: E */
    public static String m1398E(int i7) {
        if (i7 == 0) {
            return "Clear";
        }
        if (i7 == 1) {
            return "Src";
        }
        if (i7 == 2) {
            return "Dst";
        }
        if (i7 == 3) {
            return "SrcOver";
        }
        if (i7 == 4) {
            return "DstOver";
        }
        if (i7 == 5) {
            return "SrcIn";
        }
        if (i7 == 6) {
            return "DstIn";
        }
        if (i7 == 7) {
            return "SrcOut";
        }
        if (i7 == 8) {
            return "DstOut";
        }
        if (i7 == 9) {
            return "SrcAtop";
        }
        if (i7 == 10) {
            return "DstAtop";
        }
        if (i7 == 11) {
            return "Xor";
        }
        if (i7 == 12) {
            return "Plus";
        }
        if (i7 == 13) {
            return "Modulate";
        }
        if (i7 == 14) {
            return "Screen";
        }
        if (i7 == 15) {
            return "Overlay";
        }
        if (i7 == 16) {
            return "Darken";
        }
        if (i7 == 17) {
            return "Lighten";
        }
        if (i7 == 18) {
            return "ColorDodge";
        }
        if (i7 == 19) {
            return "ColorBurn";
        }
        if (i7 == 20) {
            return "HardLight";
        }
        if (i7 == 21) {
            return "Softlight";
        }
        if (i7 == 22) {
            return "Difference";
        }
        if (i7 == 23) {
            return "Exclusion";
        }
        if (i7 == 24) {
            return "Multiply";
        }
        if (i7 == 25) {
            return "Hue";
        }
        if (i7 == 26) {
            return "Saturation";
        }
        if (i7 == 27) {
            return "Color";
        }
        if (i7 == 28) {
            return "Luminosity";
        }
        return "Unknown";
    }

    /* renamed from: F */
    public static final void m1399F(List list) {
        if (list.size() >= 2) {
        } else {
            throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
        }
    }

    /* renamed from: G */
    public static final int m1400G(float f7, float[] fArr, int i7) {
        float f8 = 0.0f;
        if (f7 >= 0.0f) {
            f8 = f7;
        }
        if (f8 > 1.0f) {
            f8 = 1.0f;
        }
        if (Math.abs(f8 - f7) > 1.05E-6f) {
            f8 = Float.NaN;
        }
        fArr[i7] = f8;
        return !Float.isNaN(f8) ? 1 : 0;
    }

    /* renamed from: a */
    public static final C0644b m1401a(C0654g c0654g) {
        Canvas canvas = AbstractC0646c.f2129a;
        C0644b c0644b = new C0644b();
        c0644b.f2123a = new Canvas(c0654g.f2144a);
        return c0644b;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0179  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long m1402b(float f7, float f8, float f9, float f10, AbstractC1516c abstractC1516c) {
        int i7;
        int i8;
        int i9;
        float mo2444b;
        float mo2443a;
        int i10;
        int i11;
        int i12;
        int i13;
        float mo2444b2;
        float mo2443a2;
        int i14;
        int i15;
        int i16;
        float f11;
        float f12;
        float f13;
        float f14 = 1.0f;
        float f15 = 0.0f;
        if (abstractC1516c.mo2445c()) {
            if (f10 < 0.0f) {
                f11 = 0.0f;
            } else {
                f11 = f10;
            }
            if (f11 > 1.0f) {
                f11 = 1.0f;
            }
            int i17 = ((int) ((f11 * 255.0f) + 0.5f)) << 24;
            if (f7 < 0.0f) {
                f12 = 0.0f;
            } else {
                f12 = f7;
            }
            if (f12 > 1.0f) {
                f12 = 1.0f;
            }
            int i18 = i17 | (((int) ((f12 * 255.0f) + 0.5f)) << 16);
            if (f8 < 0.0f) {
                f13 = 0.0f;
            } else {
                f13 = f8;
            }
            if (f13 > 1.0f) {
                f13 = 1.0f;
            }
            int i19 = i18 | (((int) ((f13 * 255.0f) + 0.5f)) << 8);
            if (f9 >= 0.0f) {
                f15 = f9;
            }
            if (f15 <= 1.0f) {
                f14 = f15;
            }
            long j6 = (i19 | ((int) ((f14 * 255.0f) + 0.5f))) << 32;
            int i20 = C0677s.f2210h;
            return j6;
        }
        long j7 = abstractC1516c.f10013b;
        int i21 = AbstractC1515b.f10011e;
        if (((int) (j7 >> 32)) != 3) {
            AbstractC0643a0.m1328a("Color only works with ColorSpaces with 3 components");
        }
        int i22 = abstractC1516c.f10014c;
        if (i22 == -1) {
            AbstractC0643a0.m1328a("Unknown color space, please use a color space in ColorSpaces");
        }
        int i23 = 0;
        float mo2444b3 = abstractC1516c.mo2444b(0);
        float mo2443a3 = abstractC1516c.mo2443a(0);
        if (f7 >= mo2444b3) {
            mo2444b3 = f7;
        }
        if (mo2444b3 <= mo2443a3) {
            mo2443a3 = mo2444b3;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(mo2443a3);
        int i24 = floatToRawIntBits >>> 31;
        int i25 = (floatToRawIntBits >>> 23) & 255;
        int i26 = floatToRawIntBits & 8388607;
        if (i25 == 255) {
            if (i26 != 0) {
                i8 = 512;
            } else {
                i8 = 0;
            }
            i7 = 31;
        } else {
            i7 = i25 - 112;
            if (i7 >= 31) {
                i8 = 0;
                i7 = 49;
            } else if (i7 <= 0) {
                if (i7 >= -10) {
                    int i27 = (i26 | 8388608) >> (1 - i7);
                    if ((i27 & 4096) != 0) {
                        i27 += 8192;
                    }
                    i8 = i27 >> 13;
                    i7 = 0;
                } else {
                    i8 = 0;
                    i7 = 0;
                }
            } else {
                int i28 = i26 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i9 = (((i7 << 10) | i28) + 1) | (i24 << 15);
                    short s5 = (short) i9;
                    mo2444b = abstractC1516c.mo2444b(1);
                    mo2443a = abstractC1516c.mo2443a(1);
                    if (f8 >= mo2444b) {
                        mo2444b = f8;
                    }
                    if (mo2444b <= mo2443a) {
                        mo2443a = mo2444b;
                    }
                    int floatToRawIntBits2 = Float.floatToRawIntBits(mo2443a);
                    int i29 = floatToRawIntBits2 >>> 31;
                    i10 = (floatToRawIntBits2 >>> 23) & 255;
                    int i30 = floatToRawIntBits2 & 8388607;
                    if (i10 != 255) {
                        if (i30 != 0) {
                            i12 = 512;
                        } else {
                            i12 = 0;
                        }
                        i11 = 31;
                    } else {
                        i11 = i10 - 112;
                        if (i11 >= 31) {
                            i12 = 0;
                            i11 = 49;
                        } else if (i11 <= 0) {
                            if (i11 >= -10) {
                                int i31 = (i30 | 8388608) >> (1 - i11);
                                if ((i31 & 4096) != 0) {
                                    i31 += 8192;
                                }
                                i12 = i31 >> 13;
                                i11 = 0;
                            } else {
                                i12 = 0;
                                i11 = 0;
                            }
                        } else {
                            int i32 = i30 >> 13;
                            if ((floatToRawIntBits2 & 4096) != 0) {
                                i13 = (((i11 << 10) | i32) + 1) | (i29 << 15);
                                short s7 = (short) i13;
                                mo2444b2 = abstractC1516c.mo2444b(2);
                                mo2443a2 = abstractC1516c.mo2443a(2);
                                if (f9 >= mo2444b2) {
                                    mo2444b2 = f9;
                                }
                                if (mo2444b2 <= mo2443a2) {
                                    mo2443a2 = mo2444b2;
                                }
                                int floatToRawIntBits3 = Float.floatToRawIntBits(mo2443a2);
                                int i33 = floatToRawIntBits3 >>> 31;
                                i14 = (floatToRawIntBits3 >>> 23) & 255;
                                int i34 = 8388607 & floatToRawIntBits3;
                                if (i14 == 255) {
                                    if (i34 != 0) {
                                        i23 = 512;
                                    }
                                    i15 = i23;
                                    i23 = 31;
                                } else {
                                    int i35 = i14 - 112;
                                    if (i35 >= 31) {
                                        i15 = 0;
                                        i23 = 49;
                                    } else if (i35 <= 0) {
                                        if (i35 >= -10) {
                                            int i36 = (i34 | 8388608) >> (1 - i35);
                                            if ((i36 & 4096) != 0) {
                                                i36 += 8192;
                                            }
                                            i15 = i36 >> 13;
                                        } else {
                                            i15 = 0;
                                        }
                                    } else {
                                        int i37 = i34 >> 13;
                                        if ((floatToRawIntBits3 & 4096) != 0) {
                                            i16 = (((i35 << 10) | i37) + 1) | (i33 << 15);
                                            short s8 = (short) i16;
                                            if (f10 >= 0.0f) {
                                                f15 = f10;
                                            }
                                            if (f15 <= 1.0f) {
                                                f14 = f15;
                                            }
                                            long j8 = (i22 & 63) | ((s5 & 65535) << 48) | ((s7 & 65535) << 32) | ((65535 & s8) << 16) | ((((int) ((f14 * 1023.0f) + 0.5f)) & 1023) << 6);
                                            int i38 = C0677s.f2210h;
                                            return j8;
                                        }
                                        i15 = i37;
                                        i23 = i35;
                                    }
                                }
                                i16 = i15 | (i33 << 15) | (i23 << 10);
                                short s82 = (short) i16;
                                if (f10 >= 0.0f) {
                                }
                                if (f15 <= 1.0f) {
                                }
                                long j82 = (i22 & 63) | ((s5 & 65535) << 48) | ((s7 & 65535) << 32) | ((65535 & s82) << 16) | ((((int) ((f14 * 1023.0f) + 0.5f)) & 1023) << 6);
                                int i382 = C0677s.f2210h;
                                return j82;
                            }
                            i12 = i32;
                        }
                    }
                    i13 = i12 | (i29 << 15) | (i11 << 10);
                    short s72 = (short) i13;
                    mo2444b2 = abstractC1516c.mo2444b(2);
                    mo2443a2 = abstractC1516c.mo2443a(2);
                    if (f9 >= mo2444b2) {
                    }
                    if (mo2444b2 <= mo2443a2) {
                    }
                    int floatToRawIntBits32 = Float.floatToRawIntBits(mo2443a2);
                    int i332 = floatToRawIntBits32 >>> 31;
                    i14 = (floatToRawIntBits32 >>> 23) & 255;
                    int i342 = 8388607 & floatToRawIntBits32;
                    if (i14 == 255) {
                    }
                    i16 = i15 | (i332 << 15) | (i23 << 10);
                    short s822 = (short) i16;
                    if (f10 >= 0.0f) {
                    }
                    if (f15 <= 1.0f) {
                    }
                    long j822 = (i22 & 63) | ((s5 & 65535) << 48) | ((s72 & 65535) << 32) | ((65535 & s822) << 16) | ((((int) ((f14 * 1023.0f) + 0.5f)) & 1023) << 6);
                    int i3822 = C0677s.f2210h;
                    return j822;
                }
                i8 = i28;
            }
        }
        i9 = i8 | (i24 << 15) | (i7 << 10);
        short s52 = (short) i9;
        mo2444b = abstractC1516c.mo2444b(1);
        mo2443a = abstractC1516c.mo2443a(1);
        if (f8 >= mo2444b) {
        }
        if (mo2444b <= mo2443a) {
        }
        int floatToRawIntBits22 = Float.floatToRawIntBits(mo2443a);
        int i292 = floatToRawIntBits22 >>> 31;
        i10 = (floatToRawIntBits22 >>> 23) & 255;
        int i302 = floatToRawIntBits22 & 8388607;
        if (i10 != 255) {
        }
        i13 = i12 | (i292 << 15) | (i11 << 10);
        short s722 = (short) i13;
        mo2444b2 = abstractC1516c.mo2444b(2);
        mo2443a2 = abstractC1516c.mo2443a(2);
        if (f9 >= mo2444b2) {
        }
        if (mo2444b2 <= mo2443a2) {
        }
        int floatToRawIntBits322 = Float.floatToRawIntBits(mo2443a2);
        int i3322 = floatToRawIntBits322 >>> 31;
        i14 = (floatToRawIntBits322 >>> 23) & 255;
        int i3422 = 8388607 & floatToRawIntBits322;
        if (i14 == 255) {
        }
        i16 = i15 | (i3322 << 15) | (i23 << 10);
        short s8222 = (short) i16;
        if (f10 >= 0.0f) {
        }
        if (f15 <= 1.0f) {
        }
        long j8222 = (i22 & 63) | ((s52 & 65535) << 48) | ((s722 & 65535) << 32) | ((65535 & s8222) << 16) | ((((int) ((f14 * 1023.0f) + 0.5f)) & 1023) << 6);
        int i38222 = C0677s.f2210h;
        return j8222;
    }

    /* renamed from: c */
    public static final long m1403c(int i7) {
        long j6 = i7 << 32;
        int i8 = C0677s.f2210h;
        return j6;
    }

    /* renamed from: d */
    public static final long m1404d(long j6) {
        long j7 = j6 << 32;
        int i7 = C0677s.f2210h;
        return j7;
    }

    /* renamed from: e */
    public static long m1405e(int i7, int i8, int i9) {
        return m1403c(((i7 & 255) << 16) | (-16777216) | ((i8 & 255) << 8) | (i9 & 255));
    }

    /* renamed from: f */
    public static C0654g m1406f(int i7, int i8, int i9) {
        Bitmap createBitmap;
        C1530q c1530q = C1517d.f10019e;
        Bitmap.Config m1394A = m1394A(i9);
        if (Build.VERSION.SDK_INT >= 26) {
            createBitmap = AbstractC0656h.m1372f(i7, i8, m1394A(i9), AbstractC0680v.m1462a(c1530q));
        } else {
            createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i7, i8, m1394A);
            createBitmap.setHasAlpha(true);
        }
        return new C0654g(createBitmap);
    }

    /* renamed from: g */
    public static final C0427s m1407g() {
        return new C0427s(new Paint(7));
    }

    /* renamed from: h */
    public static final long m1408h(float f7, float f8) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f8) & 4294967295L) | (Float.floatToRawIntBits(f7) << 32);
        int i7 = C0675q0.f2201c;
        return floatToRawIntBits;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009a  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long m1409i(float f7, float f8, float f9, float f10, AbstractC1516c abstractC1516c) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if (abstractC1516c.mo2445c()) {
            long j6 = ((((((int) ((f10 * 255.0f) + 0.5f)) << 24) | (((int) ((f7 * 255.0f) + 0.5f)) << 16)) | (((int) ((f8 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f9) + 0.5f))) << 32;
            int i16 = C0677s.f2210h;
            return j6;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(f7);
        int i17 = floatToRawIntBits >>> 31;
        int i18 = (floatToRawIntBits >>> 23) & 255;
        int i19 = floatToRawIntBits & 8388607;
        int i20 = 49;
        int i21 = 512;
        int i22 = 0;
        if (i18 == 255) {
            if (i19 != 0) {
                i8 = 512;
            } else {
                i8 = 0;
            }
            i7 = 31;
        } else {
            i7 = i18 - 112;
            if (i7 >= 31) {
                i7 = 49;
                i8 = 0;
            } else if (i7 <= 0) {
                if (i7 >= -10) {
                    int i23 = (i19 | 8388608) >> (1 - i7);
                    if ((i23 & 4096) != 0) {
                        i23 += 8192;
                    }
                    i8 = i23 >> 13;
                    i7 = 0;
                } else {
                    i8 = 0;
                    i7 = 0;
                }
            } else {
                int i24 = i19 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i9 = (((i7 << 10) | i24) + 1) | (i17 << 15);
                    short s5 = (short) i9;
                    int floatToRawIntBits2 = Float.floatToRawIntBits(f8);
                    int i25 = floatToRawIntBits2 >>> 31;
                    i10 = (floatToRawIntBits2 >>> 23) & 255;
                    int i26 = floatToRawIntBits2 & 8388607;
                    if (i10 != 255) {
                        if (i26 != 0) {
                            i12 = 512;
                        } else {
                            i12 = 0;
                        }
                        i11 = 31;
                    } else {
                        i11 = i10 - 112;
                        if (i11 >= 31) {
                            i11 = 49;
                            i12 = 0;
                        } else if (i11 <= 0) {
                            if (i11 >= -10) {
                                int i27 = (i26 | 8388608) >> (1 - i11);
                                if ((i27 & 4096) != 0) {
                                    i27 += 8192;
                                }
                                i12 = i27 >> 13;
                                i11 = 0;
                            } else {
                                i12 = 0;
                                i11 = 0;
                            }
                        } else {
                            int i28 = i26 >> 13;
                            if ((floatToRawIntBits2 & 4096) != 0) {
                                i13 = (((i11 << 10) | i28) + 1) | (i25 << 15);
                                short s7 = (short) i13;
                                int floatToRawIntBits3 = Float.floatToRawIntBits(f9);
                                int i29 = floatToRawIntBits3 >>> 31;
                                i14 = (floatToRawIntBits3 >>> 23) & 255;
                                int i30 = 8388607 & floatToRawIntBits3;
                                if (i14 == 255) {
                                    if (i30 == 0) {
                                        i21 = 0;
                                    }
                                    i22 = i21;
                                    i20 = 31;
                                } else {
                                    int i31 = i14 - 112;
                                    if (i31 < 31) {
                                        if (i31 <= 0) {
                                            if (i31 >= -10) {
                                                int i32 = (i30 | 8388608) >> (1 - i31);
                                                if ((i32 & 4096) != 0) {
                                                    i32 += 8192;
                                                }
                                                i20 = 0;
                                                i22 = i32 >> 13;
                                            } else {
                                                i20 = 0;
                                            }
                                        } else {
                                            i22 = i30 >> 13;
                                            if ((floatToRawIntBits3 & 4096) != 0) {
                                                i15 = (((i31 << 10) | i22) + 1) | (i29 << 15);
                                                long max = ((((short) i15) & 65535) << 16) | ((s5 & 65535) << 48) | ((s7 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f10, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (abstractC1516c.f10014c & 63);
                                                int i33 = C0677s.f2210h;
                                                return max;
                                            }
                                            i20 = i31;
                                        }
                                    }
                                }
                                i15 = (i29 << 15) | (i20 << 10) | i22;
                                long max2 = ((((short) i15) & 65535) << 16) | ((s5 & 65535) << 48) | ((s7 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f10, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (abstractC1516c.f10014c & 63);
                                int i332 = C0677s.f2210h;
                                return max2;
                            }
                            i12 = i28;
                        }
                    }
                    i13 = i12 | (i25 << 15) | (i11 << 10);
                    short s72 = (short) i13;
                    int floatToRawIntBits32 = Float.floatToRawIntBits(f9);
                    int i292 = floatToRawIntBits32 >>> 31;
                    i14 = (floatToRawIntBits32 >>> 23) & 255;
                    int i302 = 8388607 & floatToRawIntBits32;
                    if (i14 == 255) {
                    }
                    i15 = (i292 << 15) | (i20 << 10) | i22;
                    long max22 = ((((short) i15) & 65535) << 16) | ((s5 & 65535) << 48) | ((s72 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f10, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (abstractC1516c.f10014c & 63);
                    int i3322 = C0677s.f2210h;
                    return max22;
                }
                i8 = i24;
            }
        }
        i9 = i8 | (i17 << 15) | (i7 << 10);
        short s52 = (short) i9;
        int floatToRawIntBits22 = Float.floatToRawIntBits(f8);
        int i252 = floatToRawIntBits22 >>> 31;
        i10 = (floatToRawIntBits22 >>> 23) & 255;
        int i262 = floatToRawIntBits22 & 8388607;
        if (i10 != 255) {
        }
        i13 = i12 | (i252 << 15) | (i11 << 10);
        short s722 = (short) i13;
        int floatToRawIntBits322 = Float.floatToRawIntBits(f9);
        int i2922 = floatToRawIntBits322 >>> 31;
        i14 = (floatToRawIntBits322 >>> 23) & 255;
        int i3022 = 8388607 & floatToRawIntBits322;
        if (i14 == 255) {
        }
        i15 = (i2922 << 15) | (i20 << 10) | i22;
        long max222 = ((((short) i15) & 65535) << 16) | ((s52 & 65535) << 48) | ((s722 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f10, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (abstractC1516c.f10014c & 63);
        int i33222 = C0677s.f2210h;
        return max222;
    }

    /* renamed from: j */
    public static final long m1410j(long j6, long j7) {
        float f7;
        float f8;
        long m1452a = C0677s.m1452a(j6, C0677s.m1457f(j7));
        float m1455d = C0677s.m1455d(j7);
        float m1455d2 = C0677s.m1455d(m1452a);
        float f9 = 1.0f - m1455d2;
        float f10 = (m1455d * f9) + m1455d2;
        float m1459h = C0677s.m1459h(m1452a);
        float m1459h2 = C0677s.m1459h(j7);
        float f11 = 0.0f;
        if (f10 == 0.0f) {
            f7 = 0.0f;
        } else {
            f7 = (((m1459h2 * m1455d) * f9) + (m1459h * m1455d2)) / f10;
        }
        float m1458g = C0677s.m1458g(m1452a);
        float m1458g2 = C0677s.m1458g(j7);
        if (f10 == 0.0f) {
            f8 = 0.0f;
        } else {
            f8 = (((m1458g2 * m1455d) * f9) + (m1458g * m1455d2)) / f10;
        }
        float m1456e = C0677s.m1456e(m1452a);
        float m1456e2 = C0677s.m1456e(j7);
        if (f10 != 0.0f) {
            f11 = (((m1456e2 * m1455d) * f9) + (m1456e * m1455d2)) / f10;
        }
        return m1409i(f7, f8, f11, f10, C0677s.m1457f(j7));
    }

    /* renamed from: k */
    public static final int m1411k(List list) {
        int i7 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int m3066N = AbstractC1806n.m3066N(list);
        for (int i8 = 1; i8 < m3066N; i8++) {
            if (C0677s.m1455d(((C0677s) list.get(i8)).f2211a) == 0.0f) {
                i7++;
            }
        }
        return i7;
    }

    /* renamed from: l */
    public static void m1412l(InterfaceC1570d interfaceC1570d, AbstractC0655g0 abstractC0655g0, long j6) {
        if (abstractC0655g0 instanceof C0651e0) {
            C0465c c0465c = ((C0651e0) abstractC0655g0).f2135a;
            float f7 = c0465c.f1625a;
            float f8 = c0465c.f1626b;
            interfaceC1570d.mo2531j0(j6, (Float.floatToRawIntBits(f7) << 32) | (Float.floatToRawIntBits(f8) & 4294967295L), m1421u(c0465c), 1.0f, 3);
            return;
        }
        boolean z7 = abstractC0655g0 instanceof C0653f0;
        C1573g c1573g = C1573g.f10187a;
        if (z7) {
            C0653f0 c0653f0 = (C0653f0) abstractC0655g0;
            C0660j c0660j = c0653f0.f2143b;
            if (c0660j != null) {
                interfaceC1570d.mo2526b0(c0660j, j6, c1573g);
                return;
            }
            C0466d c0466d = c0653f0.f2142a;
            float intBitsToFloat = Float.intBitsToFloat((int) (c0466d.f1636h >> 32));
            float f9 = c0466d.f1629a;
            float f10 = c0466d.f1630b;
            long floatToRawIntBits = (Float.floatToRawIntBits(f9) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L);
            float m1022b = c0466d.m1022b();
            float m1021a = c0466d.m1021a();
            interfaceC1570d.mo2533r0(j6, floatToRawIntBits, (Float.floatToRawIntBits(m1022b) << 32) | (Float.floatToRawIntBits(m1021a) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat)), c1573g);
            return;
        }
        if (abstractC0655g0 instanceof C0649d0) {
            interfaceC1570d.mo2526b0(((C0649d0) abstractC0655g0).f2132a, j6, c1573g);
            return;
        }
        throw new RuntimeException();
    }

    /* renamed from: m */
    public static void m1413m(Canvas canvas, boolean z7) {
        Method method;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29) {
            if (z7) {
                AbstractC0642a.m1313l(canvas);
                return;
            } else {
                AbstractC0642a.m1322u(canvas);
                return;
            }
        }
        if (!f2150d) {
            try {
                if (i7 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f2148b = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f2149c = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f2148b = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    f2149c = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = f2148b;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f2149c;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f2150d = true;
        }
        if (z7) {
            try {
                Method method4 = f2148b;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (!z7 && (method = f2149c) != null) {
            method.invoke(canvas, null);
        }
    }

    /* renamed from: n */
    public static final boolean m1414n(float[] fArr) {
        if (fArr.length < 16 || fArr[0] != 1.0f || fArr[1] != 0.0f || fArr[2] != 0.0f || fArr[3] != 0.0f || fArr[4] != 0.0f || fArr[5] != 1.0f || fArr[6] != 0.0f || fArr[7] != 0.0f || fArr[8] != 0.0f || fArr[9] != 0.0f || fArr[10] != 1.0f || fArr[11] != 0.0f || fArr[12] != 0.0f || fArr[13] != 0.0f || fArr[14] != 0.0f || fArr[15] != 1.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public static final long m1415o(long j6, long j7, float f7) {
        C1525l c1525l = C1517d.f10038x;
        long m1452a = C0677s.m1452a(j6, c1525l);
        long m1452a2 = C0677s.m1452a(j7, c1525l);
        float m1455d = C0677s.m1455d(m1452a);
        float m1459h = C0677s.m1459h(m1452a);
        float m1458g = C0677s.m1458g(m1452a);
        float m1456e = C0677s.m1456e(m1452a);
        float m1455d2 = C0677s.m1455d(m1452a2);
        float m1459h2 = C0677s.m1459h(m1452a2);
        float m1458g2 = C0677s.m1458g(m1452a2);
        float m1456e2 = C0677s.m1456e(m1452a2);
        if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        return C0677s.m1452a(m1409i(AbstractC2080d.m3409v(m1459h, m1459h2, f7), AbstractC2080d.m3409v(m1458g, m1458g2, f7), AbstractC2080d.m3409v(m1456e, m1456e2, f7), AbstractC2080d.m3409v(m1455d, m1455d2, f7), c1525l), C0677s.m1457f(j7));
    }

    /* renamed from: p */
    public static final float m1416p(long j6) {
        AbstractC1516c m1457f = C0677s.m1457f(j6);
        if (!AbstractC1515b.m2441a(m1457f.f10013b, AbstractC1515b.f10007a)) {
            AbstractC0643a0.m1328a("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) AbstractC1515b.m2442b(m1457f.f10013b)));
        }
        C1526m c1526m = ((C1530q) m1457f).f10079p;
        double mo1297c = c1526m.mo1297c(C0677s.m1459h(j6));
        float mo1297c2 = (float) ((c1526m.mo1297c(C0677s.m1456e(j6)) * 0.0722d) + (c1526m.mo1297c(C0677s.m1458g(j6)) * 0.7152d) + (mo1297c * 0.2126d));
        if (mo1297c2 < 0.0f) {
            mo1297c2 = 0.0f;
        }
        if (mo1297c2 > 1.0f) {
            return 1.0f;
        }
        return mo1297c2;
    }

    /* renamed from: q */
    public static final int[] m1417q(int i7, List list) {
        int i8;
        int i9 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr = new int[size];
            while (i9 < size) {
                iArr[i9] = m1426z(((C0677s) list.get(i9)).f2211a);
                i9++;
            }
            return iArr;
        }
        int[] iArr2 = new int[list.size() + i7];
        int m3066N = AbstractC1806n.m3066N(list);
        int size2 = list.size();
        int i10 = 0;
        while (i9 < size2) {
            long j6 = ((C0677s) list.get(i9)).f2211a;
            if (C0677s.m1455d(j6) == 0.0f) {
                if (i9 == 0) {
                    i8 = i10 + 1;
                    iArr2[i10] = m1426z(C0677s.m1453b(0.0f, ((C0677s) list.get(1)).f2211a));
                } else if (i9 == m3066N) {
                    i8 = i10 + 1;
                    iArr2[i10] = m1426z(C0677s.m1453b(0.0f, ((C0677s) list.get(i9 - 1)).f2211a));
                } else {
                    int i11 = i10 + 1;
                    iArr2[i10] = m1426z(C0677s.m1453b(0.0f, ((C0677s) list.get(i9 - 1)).f2211a));
                    i10 += 2;
                    iArr2[i11] = m1426z(C0677s.m1453b(0.0f, ((C0677s) list.get(i9 + 1)).f2211a));
                }
                i10 = i8;
            } else {
                iArr2[i10] = m1426z(j6);
                i10++;
            }
            i9++;
        }
        return iArr2;
    }

    /* renamed from: r */
    public static final float[] m1418r(int i7, List list) {
        if (i7 == 0) {
            return null;
        }
        float[] fArr = new float[list.size() + i7];
        fArr[0] = 0.0f;
        int m3066N = AbstractC1806n.m3066N(list);
        int i8 = 1;
        for (int i9 = 1; i9 < m3066N; i9++) {
            long j6 = ((C0677s) list.get(i9)).f2211a;
            float m3066N2 = i9 / AbstractC1806n.m3066N(list);
            int i10 = i8 + 1;
            fArr[i8] = m3066N2;
            if (C0677s.m1455d(j6) == 0.0f) {
                i8 += 2;
                fArr[i10] = m3066N2;
            } else {
                i8 = i10;
            }
        }
        fArr[i8] = 1.0f;
        return fArr;
    }

    /* renamed from: s */
    public static final void m1419s(Matrix matrix, float[] fArr) {
        float f7 = fArr[0];
        float f8 = fArr[1];
        float f9 = fArr[2];
        float f10 = fArr[3];
        float f11 = fArr[4];
        float f12 = fArr[5];
        float f13 = fArr[6];
        float f14 = fArr[7];
        float f15 = fArr[8];
        float f16 = fArr[12];
        float f17 = fArr[13];
        float f18 = fArr[15];
        fArr[0] = f7;
        fArr[1] = f11;
        fArr[2] = f16;
        fArr[3] = f8;
        fArr[4] = f12;
        fArr[5] = f17;
        fArr[6] = f10;
        fArr[7] = f14;
        fArr[8] = f18;
        matrix.setValues(fArr);
        fArr[0] = f7;
        fArr[1] = f8;
        fArr[2] = f9;
        fArr[3] = f10;
        fArr[4] = f11;
        fArr[5] = f12;
        fArr[6] = f13;
        fArr[7] = f14;
        fArr[8] = f15;
    }

    /* renamed from: t */
    public static final void m1420t(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f7 = fArr[0];
        float f8 = fArr[1];
        float f9 = fArr[2];
        float f10 = fArr[3];
        float f11 = fArr[4];
        float f12 = fArr[5];
        float f13 = fArr[6];
        float f14 = fArr[7];
        float f15 = fArr[8];
        fArr[0] = f7;
        fArr[1] = f10;
        fArr[2] = 0.0f;
        fArr[3] = f13;
        fArr[4] = f8;
        fArr[5] = f11;
        fArr[6] = 0.0f;
        fArr[7] = f14;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f9;
        fArr[13] = f12;
        fArr[14] = 0.0f;
        fArr[15] = f15;
    }

    /* renamed from: u */
    public static final long m1421u(C0465c c0465c) {
        float f7 = c0465c.f1627c - c0465c.f1625a;
        float f8 = c0465c.f1628d - c0465c.f1626b;
        return (Float.floatToRawIntBits(f8) & 4294967295L) | (Float.floatToRawIntBits(f7) << 32);
    }

    /* renamed from: v */
    public static final BlendMode m1422v(int i7) {
        BlendMode blendMode;
        BlendMode blendMode2;
        BlendMode blendMode3;
        BlendMode blendMode4;
        BlendMode blendMode5;
        BlendMode blendMode6;
        BlendMode blendMode7;
        BlendMode blendMode8;
        BlendMode blendMode9;
        BlendMode blendMode10;
        BlendMode blendMode11;
        BlendMode blendMode12;
        BlendMode blendMode13;
        BlendMode blendMode14;
        BlendMode blendMode15;
        BlendMode blendMode16;
        BlendMode blendMode17;
        BlendMode blendMode18;
        BlendMode blendMode19;
        BlendMode blendMode20;
        BlendMode blendMode21;
        BlendMode blendMode22;
        BlendMode blendMode23;
        BlendMode blendMode24;
        if (i7 == 0) {
            blendMode24 = BlendMode.CLEAR;
            return blendMode24;
        }
        if (i7 == 1) {
            blendMode23 = BlendMode.SRC;
            return blendMode23;
        }
        if (i7 == 2) {
            blendMode22 = BlendMode.DST;
            return blendMode22;
        }
        if (i7 == 3) {
            blendMode21 = BlendMode.SRC_OVER;
            return blendMode21;
        }
        if (i7 == 4) {
            blendMode20 = BlendMode.DST_OVER;
            return blendMode20;
        }
        if (i7 == 5) {
            blendMode19 = BlendMode.SRC_IN;
            return blendMode19;
        }
        if (i7 == 6) {
            blendMode18 = BlendMode.DST_IN;
            return blendMode18;
        }
        if (i7 == 7) {
            blendMode17 = BlendMode.SRC_OUT;
            return blendMode17;
        }
        if (i7 == 8) {
            blendMode16 = BlendMode.DST_OUT;
            return blendMode16;
        }
        if (i7 == 9) {
            blendMode15 = BlendMode.SRC_ATOP;
            return blendMode15;
        }
        if (i7 == 10) {
            blendMode14 = BlendMode.DST_ATOP;
            return blendMode14;
        }
        if (i7 == 11) {
            blendMode13 = BlendMode.XOR;
            return blendMode13;
        }
        if (i7 == 12) {
            blendMode12 = BlendMode.PLUS;
            return blendMode12;
        }
        if (i7 == 13) {
            return AbstractC0642a.m1304c();
        }
        if (i7 == 14) {
            return AbstractC0642a.m1320s();
        }
        if (i7 == 15) {
            return AbstractC0642a.m1324w();
        }
        if (i7 == 16) {
            return AbstractC0642a.m1327z();
        }
        if (i7 == 17) {
            return AbstractC0642a.m1299B();
        }
        if (i7 == 18) {
            return AbstractC0642a.m1301D();
        }
        if (i7 == 19) {
            blendMode11 = BlendMode.COLOR_BURN;
            return blendMode11;
        }
        if (i7 == 20) {
            blendMode10 = BlendMode.HARD_LIGHT;
            return blendMode10;
        }
        if (i7 == 21) {
            blendMode9 = BlendMode.SOFT_LIGHT;
            return blendMode9;
        }
        if (i7 == 22) {
            blendMode8 = BlendMode.DIFFERENCE;
            return blendMode8;
        }
        if (i7 == 23) {
            blendMode7 = BlendMode.EXCLUSION;
            return blendMode7;
        }
        if (i7 == 24) {
            blendMode6 = BlendMode.MULTIPLY;
            return blendMode6;
        }
        if (i7 == 25) {
            blendMode5 = BlendMode.HUE;
            return blendMode5;
        }
        if (i7 == 26) {
            blendMode4 = BlendMode.SATURATION;
            return blendMode4;
        }
        if (i7 == 27) {
            blendMode3 = BlendMode.COLOR;
            return blendMode3;
        }
        if (i7 == 28) {
            blendMode2 = BlendMode.LUMINOSITY;
            return blendMode2;
        }
        blendMode = BlendMode.SRC_OVER;
        return blendMode;
    }

    /* renamed from: w */
    public static final Rect m1423w(C0465c c0465c) {
        return new Rect((int) c0465c.f1625a, (int) c0465c.f1626b, (int) c0465c.f1627c, (int) c0465c.f1628d);
    }

    /* renamed from: x */
    public static final Rect m1424x(C3101k c3101k) {
        return new Rect(c3101k.f15698a, c3101k.f15699b, c3101k.f15700c, c3101k.f15701d);
    }

    /* renamed from: y */
    public static final RectF m1425y(C0465c c0465c) {
        return new RectF(c0465c.f1625a, c0465c.f1626b, c0465c.f1627c, c0465c.f1628d);
    }

    /* renamed from: z */
    public static final int m1426z(long j6) {
        float[] fArr = C1517d.f10015a;
        return (int) (C0677s.m1452a(j6, C1517d.f10019e) >>> 32);
    }
}
