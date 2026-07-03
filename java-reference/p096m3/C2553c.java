package p096m3;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import p006a7.C0129l;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m3.c */
/* loaded from: classes.dex */
public final class C2553c extends C0129l {
    @Override // p006a7.C0129l
    /* renamed from: h */
    public final Signature[] mo282h(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
