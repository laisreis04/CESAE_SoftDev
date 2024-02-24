<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

return new class extends Migration
{
    /**
     * Run the migrations.
     */
    public function up(): void
    {
        Schema::create('skaters', function (Blueprint $table) {
            $table->id();
            $table->foreignId('skate_brands_id')->constrained()->onDelete('cascade');
            $table->string('name_skater');
            $table->string('photo')->nullable;
            $table->date('date_bday');
            $table->timestamps();
        });
    }

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {
        Schema::dropIfExists('skaters');
    }
};
