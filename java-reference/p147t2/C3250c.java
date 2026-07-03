package p147t2;

import android.util.Log;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import p060h5.AbstractC1807o;
import p082k5.InterfaceC2317g;
import p099m6.EnumC2624y;
import p106n6.AbstractC2721b;
import p109o1.InterfaceC2796a;
import p144t.AbstractC3122c;
import p158u5.AbstractC3367j;
import p164v3.InterfaceC3580d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t2.c */
/* loaded from: classes.dex */
public final class C3250c implements InterfaceC2796a, InterfaceC3580d, InterfaceC2317g {

    /* renamed from: e */
    public final /* synthetic */ int f16073e;

    public /* synthetic */ C3250c(int i7) {
        this.f16073e = i7;
    }

    /* renamed from: a */
    public static final String m4963a(byte[] bArr, byte[][] bArr2, int i7) {
        int i8;
        boolean z7;
        int i9;
        int i10;
        byte[] bArr3 = PublicSuffixDatabase.f14869e;
        int length = bArr.length;
        int i11 = 0;
        while (i11 < length) {
            int i12 = (i11 + length) / 2;
            while (i12 > -1 && bArr[i12] != 10) {
                i12--;
            }
            int i13 = i12 + 1;
            int i14 = 1;
            while (true) {
                i8 = i13 + i14;
                if (bArr[i8] == 10) {
                    break;
                }
                i14++;
            }
            int i15 = i8 - i13;
            int i16 = i7;
            boolean z8 = false;
            int i17 = 0;
            int i18 = 0;
            while (true) {
                if (z8) {
                    i9 = 46;
                    z7 = false;
                } else {
                    byte b8 = bArr2[i16][i17];
                    byte[] bArr4 = AbstractC2721b.f14569a;
                    int i19 = b8 & 255;
                    z7 = z8;
                    i9 = i19;
                }
                byte b9 = bArr[i13 + i18];
                byte[] bArr5 = AbstractC2721b.f14569a;
                i10 = i9 - (b9 & 255);
                if (i10 != 0) {
                    break;
                }
                i18++;
                i17++;
                if (i18 == i15) {
                    break;
                }
                if (bArr2[i16].length == i17) {
                    if (i16 == bArr2.length - 1) {
                        break;
                    }
                    i16++;
                    i17 = -1;
                    z8 = true;
                } else {
                    z8 = z7;
                }
            }
            if (i10 >= 0) {
                if (i10 <= 0) {
                    int i20 = i15 - i18;
                    int length2 = bArr2[i16].length - i17;
                    int length3 = bArr2.length;
                    for (int i21 = i16 + 1; i21 < length3; i21++) {
                        length2 += bArr2[i21].length;
                    }
                    if (length2 >= i20) {
                        if (length2 <= i20) {
                            Charset charset = StandardCharsets.UTF_8;
                            AbstractC3367j.m5099d(charset, "UTF_8");
                            return new String(bArr, i13, i15, charset);
                        }
                    }
                }
                i11 = i8 + 1;
            }
            length = i12;
        }
        return null;
    }

    /* renamed from: b */
    public static final float m4964b(float f7, float[] fArr, float[] fArr2) {
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float abs = Math.abs(f7);
        float signum = Math.signum(f7);
        int binarySearch = Arrays.binarySearch(fArr, abs);
        if (binarySearch >= 0) {
            return signum * fArr2[binarySearch];
        }
        int i7 = -(binarySearch + 1);
        int i8 = i7 - 1;
        if (i8 >= fArr.length - 1) {
            float f13 = fArr[fArr.length - 1];
            float f14 = fArr2[fArr.length - 1];
            if (f13 == 0.0f) {
                return 0.0f;
            }
            return (f14 / f13) * f7;
        }
        if (i8 == -1) {
            float f15 = fArr[0];
            f10 = fArr2[0];
            f11 = f15;
            f9 = 0.0f;
            f8 = 0.0f;
        } else {
            float f16 = fArr[i8];
            float f17 = fArr[i7];
            f8 = fArr2[i8];
            f9 = f16;
            f10 = fArr2[i7];
            f11 = f17;
        }
        if (f9 == f11) {
            f12 = 0.0f;
        } else {
            f12 = (abs - f9) / (f11 - f9);
        }
        return (((f10 - f8) * Math.max(0.0f, Math.min(1.0f, f12))) + f8) * signum;
    }

    /* renamed from: c */
    public static ArrayList m4965c(List list) {
        AbstractC3367j.m5100e(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((EnumC2624y) obj) != EnumC2624y.f14222f) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1807o.m3073U(arrayList));
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj2 = arrayList.get(i7);
            i7++;
            arrayList2.add(((EnumC2624y) obj2).f14229e);
        }
        return arrayList2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, a7.i] */
    /* renamed from: d */
    public static byte[] m4966d(List list) {
        AbstractC3367j.m5100e(list, "protocols");
        ?? obj = new Object();
        ArrayList m4965c = m4965c(list);
        int size = m4965c.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj2 = m4965c.get(i7);
            i7++;
            String str = (String) obj2;
            obj.m272y(str.length());
            obj.m248K(str);
        }
        return obj.m260m(obj.f524f);
    }

    /* renamed from: e */
    public static boolean m4967e() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    @Override // p164v3.InterfaceC3580d
    /* renamed from: g */
    public void mo4280g() {
        switch (this.f16073e) {
            case 3:
                return;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                return;
        }
    }

    @Override // p164v3.InterfaceC3580d
    /* renamed from: h */
    public void mo4281h(int i7, Object obj) {
        String str;
        switch (this.f16073e) {
            case 3:
                return;
            default:
                switch (i7) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case 3:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case 4:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case AbstractC3122c.f15761f /* 5 */:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case AbstractC3122c.f15759d /* 6 */:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case 7:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case 8:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case AbstractC3122c.f15758c /* 9 */:
                    default:
                        str = "";
                        break;
                    case AbstractC3122c.f15760e /* 10 */:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i7 != 6 && i7 != 7 && i7 != 8) {
                    Log.d("ProfileInstaller", str);
                    return;
                } else {
                    Log.e("ProfileInstaller", str, (Throwable) obj);
                    return;
                }
        }
    }

    public String toString() {
        switch (this.f16073e) {
            case 7:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }

    /* renamed from: f */
    private final void m4968f() {
    }

    /* renamed from: i */
    private final void m4969i(int i7, Object obj) {
    }
}
