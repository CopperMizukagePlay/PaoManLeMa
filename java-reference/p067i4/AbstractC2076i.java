package p067i4;

import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i4.i */
/* loaded from: classes.dex */
public abstract class AbstractC2076i {

    /* renamed from: a */
    public static final Charset f12294a = Charset.defaultCharset();

    /* renamed from: b */
    public static final Charset f12295b;

    /* renamed from: c */
    public static final Charset f12296c;

    /* renamed from: d */
    public static final boolean f12297d;

    static {
        Charset charset;
        Charset charset2;
        boolean z7;
        Charset charset3 = null;
        try {
            charset = Charset.forName("SJIS");
        } catch (UnsupportedCharsetException unused) {
            charset = null;
        }
        f12295b = charset;
        try {
            charset2 = Charset.forName("GB2312");
        } catch (UnsupportedCharsetException unused2) {
            charset2 = null;
        }
        f12296c = charset2;
        try {
            charset3 = Charset.forName("EUC_JP");
        } catch (UnsupportedCharsetException unused3) {
        }
        Charset charset4 = f12295b;
        if ((charset4 != null && charset4.equals(f12294a)) || (charset3 != null && charset3.equals(f12294a))) {
            z7 = true;
        } else {
            z7 = false;
        }
        f12297d = z7;
    }
}
