package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.paoman.lema.R;
import p023c5.InterfaceC0422n;
import p023c5.InterfaceC0426r;
import p031d5.C0510j;
import p052g4.AbstractC1681i;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
public class DecoratedBarcodeView extends FrameLayout {

    /* renamed from: e */
    public BarcodeView f1521e;

    /* renamed from: f */
    public ViewfinderView f1522f;

    /* renamed from: g */
    public TextView f1523g;

    public DecoratedBarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m980a(attributeSet);
    }

    /* renamed from: a */
    public final void m980a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1681i.f10467c);
        int resourceId = obtainStyledAttributes.getResourceId(0, R.layout.zxing_barcode_scanner);
        obtainStyledAttributes.recycle();
        View.inflate(getContext(), resourceId, this);
        BarcodeView barcodeView = (BarcodeView) findViewById(R.id.zxing_barcode_surface);
        this.f1521e = barcodeView;
        if (barcodeView != null) {
            barcodeView.m896b(attributeSet);
            ViewfinderView viewfinderView = (ViewfinderView) findViewById(R.id.zxing_viewfinder_view);
            this.f1522f = viewfinderView;
            if (viewfinderView != null) {
                viewfinderView.setCameraPreview(this.f1521e);
                this.f1523g = (TextView) findViewById(R.id.zxing_status_view);
                return;
            }
            throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.ViewfinderView on provided layout with the id \"zxing_viewfinder_view\".");
        }
        throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.BarcodeView on provided layout with the id \"zxing_barcode_surface\".");
    }

    public BarcodeView getBarcodeView() {
        return (BarcodeView) findViewById(R.id.zxing_barcode_surface);
    }

    public C0510j getCameraSettings() {
        return this.f1521e.getCameraSettings();
    }

    public InterfaceC0422n getDecoderFactory() {
        return this.f1521e.getDecoderFactory();
    }

    public TextView getStatusView() {
        return this.f1523g;
    }

    public ViewfinderView getViewFinder() {
        return this.f1522f;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (i7 != 24) {
            if (i7 != 25) {
                if (i7 == 27 || i7 == 80) {
                    return true;
                }
                return super.onKeyDown(i7, keyEvent);
            }
            this.f1521e.setTorch(false);
            return true;
        }
        this.f1521e.setTorch(true);
        return true;
    }

    public void setCameraSettings(C0510j c0510j) {
        this.f1521e.setCameraSettings(c0510j);
    }

    public void setDecoderFactory(InterfaceC0422n interfaceC0422n) {
        this.f1521e.setDecoderFactory(interfaceC0422n);
    }

    public void setStatusText(String str) {
        TextView textView = this.f1523g;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setTorchListener(InterfaceC0426r interfaceC0426r) {
    }
}
