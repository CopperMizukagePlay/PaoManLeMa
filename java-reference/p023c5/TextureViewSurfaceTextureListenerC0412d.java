package p023c5;

import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c5.d */
/* loaded from: classes.dex */
public final class TextureViewSurfaceTextureListenerC0412d implements TextureView.SurfaceTextureListener {

    /* renamed from: a */
    public final /* synthetic */ AbstractC0415g f1396a;

    public TextureViewSurfaceTextureListenerC0412d(AbstractC0415g abstractC0415g) {
        this.f1396a = abstractC0415g;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i8) {
        onSurfaceTextureSizeChanged(surfaceTexture, i7, i8);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i8) {
        C0432x c0432x = new C0432x(i7, i8);
        AbstractC0415g abstractC0415g = this.f1396a;
        abstractC0415g.f1419t = c0432x;
        abstractC0415g.m899e();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
