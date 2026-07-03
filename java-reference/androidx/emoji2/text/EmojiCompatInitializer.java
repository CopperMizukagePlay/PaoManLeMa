package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.C0216v;
import androidx.lifecycle.InterfaceC0213t;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import p096m3.C2560j;
import p096m3.C2561k;
import p096m3.C2570t;
import p193z3.C3868a;
import p193z3.InterfaceC3869b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC3869b {
    @Override // p193z3.InterfaceC3869b
    /* renamed from: a */
    public final List mo411a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [m3.i, a0.e1, java.lang.Object] */
    @Override // p193z3.InterfaceC3869b
    /* renamed from: b */
    public final Object mo412b(Context context) {
        Object obj;
        ?? obj2 = new Object();
        obj2.f109e = context.getApplicationContext();
        C2570t c2570t = new C2570t(obj2);
        c2570t.f13962b = 1;
        if (C2560j.f13927k == null) {
            synchronized (C2560j.f13926j) {
                try {
                    if (C2560j.f13927k == null) {
                        C2560j.f13927k = new C2560j(c2570t);
                    }
                } finally {
                }
            }
        }
        C3868a m5885c = C3868a.m5885c(context);
        m5885c.getClass();
        synchronized (C3868a.f18129e) {
            try {
                obj = m5885c.f18130a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = m5885c.m5887b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        C0216v mo415g = ((InterfaceC0213t) obj).mo415g();
        mo415g.m468a(new C2561k(this, mo415g));
        return Boolean.TRUE;
    }
}
