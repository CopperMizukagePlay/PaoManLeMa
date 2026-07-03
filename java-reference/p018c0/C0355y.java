package p018c0;

import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import p060h5.AbstractC1807o;
import p103n2.C2713a;
import p103n2.C2714b;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c0.y */
/* loaded from: classes.dex */
public final class C0355y {

    /* renamed from: a */
    public static final C0355y f1207a = new Object();

    /* renamed from: a */
    public final void m793a(EditorInfo editorInfo, C2714b c2714b) {
        if (AbstractC3367j.m5096a(c2714b, C2714b.f14562g)) {
            editorInfo.hintLocales = null;
            return;
        }
        ArrayList arrayList = new ArrayList(AbstractC1807o.m3073U(c2714b));
        Iterator it = c2714b.f14563e.iterator();
        while (it.hasNext()) {
            arrayList.add(((C2713a) it.next()).f14561a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
