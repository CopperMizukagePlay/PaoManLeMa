package p001a0;

import android.R;
import android.content.res.Resources;
import androidx.compose.p007ui.platform.AndroidCompositionLocals_androidKt;
import p085l0.C2395p;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.p */
/* loaded from: classes.dex */
public final class C0061p extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public final /* synthetic */ int f293f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0061p(int i7) {
        super(2);
        this.f293f = i7;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        int i7;
        C2395p c2395p = (C2395p) obj;
        ((Number) obj2).intValue();
        c2395p.m3857Z(-1451087197);
        int i8 = this.f293f;
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 == 4) {
                        i7 = R.string.selectAll;
                    } else {
                        throw null;
                    }
                } else {
                    i7 = R.string.paste;
                }
            } else {
                i7 = R.string.copy;
            }
        } else {
            i7 = R.string.cut;
        }
        String string = ((Resources) c2395p.m3878k(AndroidCompositionLocals_androidKt.f787c)).getString(i7);
        c2395p.m3888r(false);
        return string;
    }
}
