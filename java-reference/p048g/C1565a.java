package p048g;

import android.content.Intent;
import com.paoman.lema.MainActivity;
import p006a7.C0129l;
import p102n1.AbstractC2710c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g.a */
/* loaded from: classes.dex */
public final class C1565a extends AbstractC2710c {

    /* renamed from: v */
    public final String f10175v;

    public C1565a(String str) {
        this.f10175v = str;
    }

    @Override // p102n1.AbstractC2710c
    /* renamed from: A */
    public final C0129l mo2519A(MainActivity mainActivity, Object obj) {
        AbstractC3367j.m5100e((String) obj, "input");
        return null;
    }

    @Override // p102n1.AbstractC2710c
    /* renamed from: K */
    public final Object mo2520K(Intent intent, int i7) {
        if (i7 != -1) {
            intent = null;
        }
        if (intent == null) {
            return null;
        }
        return intent.getData();
    }

    @Override // p102n1.AbstractC2710c
    /* renamed from: g */
    public final Intent mo2521g(MainActivity mainActivity, Object obj) {
        String str = (String) obj;
        AbstractC3367j.m5100e(str, "input");
        Intent putExtra = new Intent("android.intent.action.CREATE_DOCUMENT").setType(this.f10175v).putExtra("android.intent.extra.TITLE", str);
        AbstractC3367j.m5099d(putExtra, "putExtra(...)");
        return putExtra;
    }
}
