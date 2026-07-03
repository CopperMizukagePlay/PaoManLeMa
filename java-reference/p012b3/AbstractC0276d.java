package p012b3;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.lifecycle.C0212s0;
import java.lang.reflect.Method;
import p102n1.AbstractC2710c;
import p159u6.AbstractC3393k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: b3.d */
/* loaded from: classes.dex */
public abstract class AbstractC0276d {

    /* renamed from: a */
    public static final AbstractC2710c f1019a;

    /* renamed from: b */
    public static Paint f1020b;

    static {
        AbstractC3393k.m5137h("TypefaceCompat static init");
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31) {
            f1019a = new AbstractC2710c();
        } else if (i7 >= 29) {
            f1019a = new AbstractC2710c();
        } else if (i7 >= 28) {
            f1019a = new C0279g();
        } else if (i7 >= 26) {
            f1019a = new C0279g();
        } else {
            Method method = C0278f.f1023x;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f1019a = new AbstractC2710c();
            } else {
                f1019a = new AbstractC2710c();
            }
        }
        new C0212s0(1);
        f1020b = null;
        Trace.endSection();
    }

    /* renamed from: a */
    public static Font m611a(Typeface typeface) {
        PositionedGlyphs shapeTextRun;
        int glyphCount;
        Font font;
        if (f1020b == null) {
            f1020b = new Paint();
        }
        f1020b.setTextSize(10.0f);
        f1020b.setTypeface(typeface);
        shapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, f1020b);
        glyphCount = shapeTextRun.glyphCount();
        if (glyphCount != 0) {
            font = shapeTextRun.getFont(0);
            return font;
        }
        return null;
    }
}
