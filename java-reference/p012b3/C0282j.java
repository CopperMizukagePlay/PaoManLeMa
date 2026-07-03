package p012b3;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.Objects;
import p037e3.C0692f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: b3.j */
/* loaded from: classes.dex */
public final class C0282j extends C0281i {
    @Override // p012b3.C0281i
    /* renamed from: N */
    public final Font mo618N(C0692f c0692f) {
        String str;
        Font m611a;
        Uri uri = c0692f.f2246a;
        boolean equals = Objects.equals(uri.getScheme(), "systemfont");
        String str2 = c0692f.f2250e;
        if (equals) {
            str = uri.getAuthority();
        } else {
            str = null;
        }
        if (str != null) {
            Typeface create = Typeface.create(str, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create == null || create.equals(create2)) {
                create = null;
            }
            if (create != null && (m611a = AbstractC0276d.m611a(create)) != null) {
                if (TextUtils.isEmpty(str2)) {
                    return m611a;
                }
                try {
                    return new Font.Builder(m611a).setFontVariationSettings(str2).build();
                } catch (IOException unused) {
                    Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
                    return null;
                }
            }
        }
        return null;
    }
}
