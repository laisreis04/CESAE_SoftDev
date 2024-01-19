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
        Schema::create('_tasks', function (Blueprint $table) {
            $table->id();
            $table->string('nome')->nullable;
            $table->text('descricao')->nullable;
            $table->date('due_at')->nullable;
            $table->boolean('status')->nullable;
            $table->unsignedBigInteger('user_id');
            $table->foreign('user_id')->references('id')->on('users');
            $table->timestamps();
        });
    }

    // $table->unsignedBigInteger('user_id')->after('id');
    //         $table->foreing('user_id')->references('id')->on('users');

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {
        Schema::dropIfExists('_tasks');
    }
};
